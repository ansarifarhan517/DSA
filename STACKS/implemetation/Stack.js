class Stack {
    constructor() {
        this.stack = []
    }

    push(element) {
        return this.stack.push(element)

    }

    pop() {
        if (this.size() === 0) {
            return "Stack is Empty Cannot Perform Pop"
        }
        return this.stack.pop()
    }

    size() {
        return this.stack.length
    }

    isEmpty() {
        return this.stack.length === 0
    }

}

const stack = new Stack()

stack.push(2)
stack.push(4)
stack.push(3)
stack.pop()
stack.pop()
stack.pop()
console.log(stack.pop())

console.log(stack.isEmpty())
stack.push(4)
stack.push(4)
stack.push(4)

console.log(stack.isEmpty())
console.log(stack)

