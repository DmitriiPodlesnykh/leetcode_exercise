package twodarrays

/**
 * Given a matrix of M x N elements (M rows, N columns),
 * return all elements of the matrix in diagonal order as shown in the below image.
 *
 * Example:
 *
 * Input:
 * [
 *  [ 1, 2, 3 ],
 *  [ 4, 5, 6 ],
 *  [ 7, 8, 9 ]
 * ]
 *
 * Output:  [1,2,4,7,5,3,6,8,9]
 *
 * Note: The total number of elements of the given matrix will not exceed 10,000.
 */
class DiagonalTraverseSolution {

    fun findDiagonalOrder(matrix: Array<IntArray>): IntArray {
        if (matrix.isEmpty()) {
            return intArrayOf()
        }
        return findDiagonalOrderFromNonEmptyMatrix(matrix)
    }

    private fun findDiagonalOrderFromNonEmptyMatrix(matrix: Array<IntArray>): IntArray {
        val lastXIndex = matrix[0].size
        val lastYIndex = matrix.size
        val result = IntArray(lastXIndex * lastYIndex)

        var isStartFromTop = false
        var resultNextElementIndex = 0
        for (currentDiagonalIndex in 0 until lastYIndex) {
            if (isStartFromTop) {
                var currentPositionInDiagonalIndex = 0
                while (currentPositionInDiagonalIndex <= currentDiagonalIndex) {
                    result[resultNextElementIndex] = matrix[currentDiagonalIndex + currentPositionInDiagonalIndex - 1][currentDiagonalIndex - currentPositionInDiagonalIndex]
                    resultNextElementIndex++
                    currentPositionInDiagonalIndex++
                }
            } else {
                var j = currentDiagonalIndex
                while (j >= 0) {
                    result[resultNextElementIndex] = matrix[j][currentDiagonalIndex - j]
                    resultNextElementIndex++
                    j--
                }
            }
            isStartFromTop = !isStartFromTop
        }
        for (i in lastYIndex downTo 2) {
            if (isStartFromTop) {
                var j = 1
                while (j <= lastXIndex-1) {
                    result[resultNextElementIndex] = matrix[lastYIndex + j - i][lastXIndex-j]
                    resultNextElementIndex++
                    j++
                }
            } else {
                var j = i
                while (j > 1) {
                    result[resultNextElementIndex] = matrix[lastYIndex - i +1][lastXIndex - j +1]
                    resultNextElementIndex++
                    j--
                }
            }
            isStartFromTop = !isStartFromTop
        }
        return result
    }
}