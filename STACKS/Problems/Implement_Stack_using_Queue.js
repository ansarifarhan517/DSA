/* Q. Implement the Stack using Two Queues */

/* Solution : The Solution is Simple we have two queues 
              queue1, queue2 while enqueing the elemenets in Stack we have queue1 that is primary
              we should push the elements in  queue1 if the queue1 length is 0 eg [2] and if not
              then,now the length is 1 so enquieing the next element 3, so whe have to push the 
              like this [3,2] which is not posiible in stack but we have queue so well push all 
              the elemnents of queue1 to queue2 i.e queue2 = [2] and then push the elemnt 3 to 
              queue1 i.e queue1 = [3] and again push all the lements from queue2 to queue1 i,e 
              queue1 = [3,2] , so now we can pop i.e last elemnet 3 first out
              
*/

class Stack {
    constructor() {
        this.queue1 = []
        this.queue2 = []
    }

    push(element) {
        while (this.queue1.length !== 0) {
            this.queue2.push(this.queue1.shift())
        }
        this.queue1.push(element)
        while (this.queue2.length !== 0) {
            this.queue1.push(this.queue2.shift())
        }
        return element
    }

    pop() {

        return this.queue1.shift()
    }

    size() {
        return this.queue2.length
    }

    isEmpty() {
        return this.queue2.length === 0
    }

}

const stack = new Stack()

console.log(stack.push(1))
console.log(stack.push(2))
console.log(stack.push(3))
console.log(stack.pop())
console.log(stack.pop())
console.log(stack.pop())
// console.log(stack.queue2)
// console.log(stack.push(3))
// console.log(stack.push(5))
// console.log(stack.pop())
// console.log(stack.pop())
// console.log(stack.queue2)



