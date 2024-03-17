/*
    - CircularQueue Should have fixed length unlike Normal Queue 
    - k is the size of Queue
    - In Circular Queue the Front and Rear is on the start when the queue is initialize
    - Deletion is performed from Front , Insertion is Performed from Rear
*/
//  
const CircularQueue = function (k) {
    this.queue = []
    this.size = k
}

CircularQueue.prototype.enqueue = function (element) {
    if (this.size === this.queue.length) {
        return "Cannot Perform Enqueue Beacuse Queue is Full"
    }
    return this.queue.push(element)
}

CircularQueue.prototype.dequeue = function () {
    if (this.queue.length === 0) {
        return "Cannot Perform Dequeue Beacuse Queue is Empty"
    }
    return this.queue.shift()
}

CircularQueue.prototype.Front = function () {
    if (this.queue.length === 0) {
        return "Cannot Perform Front Beacuse Queue is Empty"
    }
    return this.queue[0]
}

CircularQueue.prototype.Rear = function () {
    if (this.queue.length === 0) {
        return "Cannot Perform Rear Beacuse Queue is Empty"
    }
    return this.queue[this.queue.length - 1]
}

CircularQueue.prototype.isEmpty = function () {
    return this.queue.length === 0
}
CircularQueue.prototype.isFull = function () {
    return this.queue.length === this.size
}

const circularQueue = new CircularQueue(3)
circularQueue.enqueue(5)
circularQueue.enqueue(1)
circularQueue.enqueue(3)
circularQueue.dequeue()
circularQueue.enqueue(9)

console.log(circularQueue.Front(), circularQueue.Rear())
