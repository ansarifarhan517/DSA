
//[[1,2,3],
//[2,3,4]]

const getRichestCustomerWealth = (matrix) => {
    let maxPrice = -Infinity, price = 0
    for (let i = 0; i < matrix.length; i++) {
        for (let j = 0; j < matrix[i].length; j++) {
            price = price + matrix[i][j]
        }
        maxPrice = Math.max(maxPrice, price)
    }
    return maxPrice
}