const getSearchByBinarySearch = (array, searchElement) => {
    let start = 0, end = array.length - 1, mid;
    while (start <= end) {
        mid = Math.floor((start + end) / 2)
        if (array[mid] === searchElement) {
            return mid
        }
        else if (searchElement > array[mid]) {
            start = mid + 1
        }
        else {
            end = mid - 1
        }
    }
    return -1
}

console.log(getSearchByBinarySearch([1, 2, 3, 4], 1)) 