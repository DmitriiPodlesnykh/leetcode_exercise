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
        val lastXIndex = matrix[0].size
        val lastYIndex = matrix.size
        val result = IntArray(lastXIndex * lastYIndex)

        var isStartFromTop = false
        var resultNextElement = 0
        for (i in 0 until lastYIndex) {
            if (isStartFromTop) {
                var j = 0
                while (j <= i) {
                    result[resultNextElement] = matrix[i + j - 1][i - j]
                    resultNextElement++
                    j++
                }
            } else {
                var j = i
                while (j >= 0) {
                    result[resultNextElement] = matrix[j][i - j]
                    resultNextElement++
                    j--
                }
            }
            isStartFromTop = !isStartFromTop
        }
        for (i in lastYIndex - 1 downTo 0) {
            if (isStartFromTop) {
                var j = 0
                while (j < i) {
                    result[resultNextElement] = matrix[i + j - 1][i - j]
                    resultNextElement++
                    j++
                }
            } else {
                var j = i
                while (j > 0) {
                    result[resultNextElement] = matrix[lastYIndex - i][lastXIndex - j]
                    resultNextElement++
                    j--
                }
            }
            isStartFromTop = !isStartFromTop
        }
        return result
    }
}