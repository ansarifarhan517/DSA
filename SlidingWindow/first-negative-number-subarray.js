const array = [12, -1, -7, 8, -15, 30, 16, 28], windowSize = 2

/* 
    In this Approach We have loop to the end of array and checks the each number while running from 0 to n 
    that the number is negative and if the number is negative then we push it into a queue and as we reach 
    to the windowsize we check that if our queue length is 0 that means we found 0 negative number till yet 
    and if queue length is greater than 0 so we we know that the very first element of queue will be the 
    first negative number of the window so we adds it to the results array and then we check whether the first 
    element of window is present in queue[0] if so that means we have to pop out the first element of queue 
    i.e queue[0] beacause the window will move ahead so we need to remove 
*/

//  Time Complexity : O(n)
//  Space Complexity : 

const getFirstNegativeNumberSubarray = (array, windowSize) => {
    const queue = [], results = []
    for (let index = 0; index < array.length; index++) {
        if (array[index] < 0) {
            queue.push(array[index])
        }
        if (index >= windowSize - 1) {
            if (queue.length === 0) {
                results.push(0)
            }
            else {
                results.push(queue[0])
                if (array[index - windowSize + 1] === queue[0]) { //
                    queue.shift()

                }

            }
        }
    }
    return results;
}


/* 
    In this Approach We have i and j, 
    i is start of window and j is end of window and
    what we do is increse the j until it reaches the window size 
    and if j reaches the window size we start a while loop from start to end of window
    and  inside the while loop we check that if the first number is negative then break and
    move the sliding window and repeat
*/

//  Time Complexity : O(n * k)
//  Space Complexity : 

const getFirstNegativeNumberSubarray2 = (array, windowSize) => {
    let i = 0; results = []
    for (let j = 0; j < array.length; j++) {
        if (j - i == windowSize - 1) {
            let k = i
            while (k <= j) {
                if (array[k] < 0) {
                    results.push(array[k]);
                    break;
                } else {
                    k++;
                }
                k++
            }
            i++
        }
    }
}


