/* Q. Implement the Queue using Two Stacks */

/* Solution : The Solution is Simple we have two stacks 
              stack1, stack2 while enqueing the elemenets is queue we should push all the 
              elements in stack 1 and while dequeing we should first insert all the 
              elements in stack 2 in reverse order from stack 1 for eg stack1 has [1,2,3]
              and to dequeue we ant to remove 1 i.e front of queue and we have stack thats y 
              we will first insert the elements in revers order in stack 2 for eg [3,2,1],
              now stack2 can be poped i.e 1 beacuse it follows LIFO
*/

class Queue {
    constructor() {
        this.stack1 = []
        this.stack2 = []
    }

    push(element) {
        this.stack1.push(element)
        return element
    }

    pop() {
        if (this.stack1.length === 0 && this.stack2.length === 0) {
            return "Cannor perform"
        }
        if (this.stack2.length === 0) {
            while (this.stack1.length > 0) {
                this.stack2.push(this.stack1.pop())
            }
        }
        return this.stack2.pop()
    }

    isEmpty() {
        return this.stack1.length === 0;
    }

    size() {
        return this.stack1.length
    }
}

const queue = new Queue()



console.log(queue.push(1))
console.log(queue.push(2))
console.log(queue.push(3))
console.log(queue.pop())
console.log(queue.pop())
console.log(queue.pop())
console.log(queue.pop())
