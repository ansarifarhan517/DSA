/* 
    In this Approach We have loop to the end of array and sums until we reach to window size and 
    as we reach  for the first time we check for maximum and then removes the last element of window 
    by logic i - windowSize + 1 for next iteration
*/

//  Time Complexity : O(n)
//  Space Complexity : 

const getMaximumSubArraySum = (array, windowSize) => {
    let sum = 0, maximum = -Infinity
    for (let index = 0; index < array.length; index++) {
        sum += array[index]
        if (i >= windowSize - 1) {
            maximum = Math.max(sum, maximum)
            sum = sum - array[i - windowSize + 1]
        }
        return maximum;
    }
}


/* 
    In this Approach We have i and j, 
    i is start of window and j is end of window and
    what we do is increse the j until it reaches the window size 
    and if j reaches the window size we check maximum and 
    after that we remove the ith element that is the start of the current window
*/

//  Time Complexity : O(n)
//  Space Complexity : 

const getMaximumSubArraySum2 = (array, windowSize) => {
    let i = 0, maximum = -Infinity, sum = 0
    for (let j = 0; j < array.length; j++) {
        sum += array[j]
        if (j - i === windowSize - 1) {
            maximum = Math.max(maximum, sum)
            sum = sum - array[i]
            i++
        }
    }
    return maximum
}

const array = [1, 2, 4, 1, 27]
const windowSize = 3;
const result = getMaximumSubArraySum2(array, windowSize);
console.log(`Maximum subarray sum with window size ${windowSize}: ${result}`);

