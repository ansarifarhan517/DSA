
const getlinearSearch = (matrix, target) => {
    if (matrix.length === 0) {
        return -1;
    }
    for (let i = 0; i < matrix.length; i++) {
        for (let j = 0; j < matrix[i].length; j++) {
            if (matrix[i][j] === target) {
                return i
            }
        }

    }
    return -1
}

const result = getlinearSearch([[9, 2, 1], [4, 10, 21], [89]], 89)
if (result != -1) {
    console.log(`Element found at ${result}`)
}
else {
    console.log(`Element not found`)

}