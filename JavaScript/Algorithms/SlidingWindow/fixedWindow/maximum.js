// const array = [1, 2, 3, 1, 4, 5, 2, 3, 6], windowSize = 2
const array = [1, 3, -1, -3, 5, 3, 6, 7], windowSize = 3
// queue = [1]
//results= [3]
const getMaxFromSubArray = (arr, k) => {
    let queue = [], maximum = -Infinity, results = []
    for (let index = 0; index < arr.length; index++) {
        if (arr[index] > maximum) {
            queue = [index];
            maximum = Math.max(arr[index], maximum)
        }
        else if (queue[0] <= index - k) {
            queue.shift(); // Remove elements that are out of the current window
        }
        if (index >= k - 1) {
            results.push(arr[queue[0]])
            if (arr[index - k + 1] === arr[queue[0]]) {
                queue.shift()
                maximum = -Infinity
            }
        }
    }
    return results
}
console.log(getMaxFromSubArray(array, windowSize))

//BELOW IS NAIVE APPROACH
const getMax = (arr, k) => {
    let maxSlidingWindow = []
    for (let index = 0; index < arr.length; index++) {
        maxSlidingWindow.push(Math.max(...arr.slice(index, k + index)))
    }
    return maxSlidingWindow
}

console.log(getMax(array, windowSize))

max_number = Integer.Min_VALUE;
max_number_index = -1

// GET MAXIMUM NUMBER FOR FIRST WINDOW
