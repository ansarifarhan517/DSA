
//Source : https://www.youtube.com/watch?v=dGq0gi0wv64&list=PLKhlp2qtUcSaCVJEt4ogEFs6I41pNnMU5&index=3
//Implement Custom Map , Filter, Reduce func 

// --Custom Start Map Implementations
Array.prototype.myMap = function (cb) {
    let temp = []
    for (let i = 0; i < this.length; i++) {
        temp.push(cb(this[i], i, this))
    }
    return temp
}
let nums = [1, 2, 3, 4]

console.log(nums.myMap(i => {
    return i * 3;
}))
// --Custom End Map Implementations

// --Custom Start Filter Implementations
Array.prototype.myFilter = function (cb) {
    let temp = []
    for (let i = 0; i < this.length; i++) {
        if (cb(this[i], i, this)) temp.push(this[i])
    }
    return temp
}

console.log(nums.myFilter((i) => {
    return i < 4;
}))
// --Custom End Filter Implementations
// --Custom Start Reducer Implementations
//array.reducer((acc , currentValue, i ,arr  ) => ), initialValue)
Array.prototype.myReducer = function (cb, initialValue) {
    let accumalator = initialValue
    for (let i = 0; i < this.length; i++) {
        accumalator = accumalator ? cb(accumalator, this[i], i, this) : this[i];
    }
    return accumalator
}
const sum = [1, 2, 3, 4]
sum.myReducer((acc, currentValue) => acc += currentValue, 0)
// --Custom End Filter Implementations



