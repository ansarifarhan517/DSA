
const getlinearSearch = (array, target) => {
    if (array.length === 0) {
        return -1;
    }
    for (let i = 0; i < array.length; i++) {

        if (array[i] === target) {
            return i
        }

    }
    return -1
}

const result = getlinearSearch([9, 2, 1, 4, 10, 21, 89], 89)
if (result != -1) {
    console.log(`Element found at ${result}`)
}
else {
    console.log(`Element not found`)

}