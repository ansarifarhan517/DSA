class Queue {
    constructor() {
        this.queue = []
    }

    push(element) {
        this.queue.push(element)
        return element
    }

    pop() {
        if (this.size() === 0) {
            return "Cannot Perform Pop Operation because Queue is Empty"
        }
        return this.queue.shift()
    }

    isEmpty() {
        return this.queue.length === 0;
    }

    size() {
        return this.queue.length
    }
}

const queue = new Queue()

console.log(queue.push(4))
console.log(queue.push(5))
console.log(queue.push(1))
console.log(queue)
console.log(queue.pop())
console.log(queue.pop())
console.log(queue)
console.log(queue.isEmpty())
console.log(queue.pop())
console.log(queue.isEmpty())
console.log(queue)



