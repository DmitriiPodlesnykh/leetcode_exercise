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

    data class TriangleData(val isStartFromTop : Boolean, var result: IntArray, var resultNextElementIndex: Int)

    fun findDiagonalOrder(matrix: Array<IntArray>): IntArray {
        if (matrix.isEmpty()) {
            return intArrayOf()
        }
        return findDiagonalOrderFromNonEmptyMatrix(matrix)
    }

    private fun findDiagonalOrderFromNonEmptyMatrix(matrix: Array<IntArray>): IntArray {
        val lastXIndex = matrix[0].size
        val lastYIndex = matrix.size

        val firstTriangleResult: TriangleData = FirstTriangleSolution().prepare(matrix)
        var isStartFromTop = firstTriangleResult.isStartFromTop;
        var resultNextElementIndex = firstTriangleResult.resultNextElementIndex
        val result = firstTriangleResult.result

        for (i in lastYIndex downTo 2) {
            if (isStartFromTop) {
                var j = 1
                while (j <= lastXIndex-1) {
                    result[resultNextElementIndex] = matrix[lastYIndex + j - i][lastXIndex-j]
                    resultNextElementIndex++
                    j++
                }
            } else {
                var j = 1
                while (j <= lastXIndex-1 ) {
                    result[resultNextElementIndex] = matrix[i][lastXIndex - j]
                    resultNextElementIndex++
                    j++
                }
            }
            isStartFromTop = !isStartFromTop
        }
        return result
    }
}