package twodarrays

class SecondTriangleSolution {

    fun prepare(firstTriangleResult: FirstTriangleDataResponse, matrix: Array<IntArray>) : IntArray {
        val lastXIndex = matrix[0].size
        val lastYIndex = matrix.size
        var isStartFromTop = firstTriangleResult.isStartFromTop;
        var resultNextElementIndex = firstTriangleResult.resultNextElementIndex
        val result = firstTriangleResult.result

        for (currentDiagonalIndex in lastXIndex-1 downTo 1) {
            if (isStartFromTop) {
                var currentPositionInDiagonalIndex = 0
                var y = 0;
                while (y < currentDiagonalIndex) {
                    result[resultNextElementIndex] = matrix[lastXIndex - currentDiagonalIndex + y][lastXIndex-currentPositionInDiagonalIndex-1]
                    resultNextElementIndex++
                    currentPositionInDiagonalIndex++
                    y++
                }
            } else {
                var currentPositionInDiagonalIndex = currentDiagonalIndex
                var y = 1;
                while (currentPositionInDiagonalIndex > 0 ) {
                    result[resultNextElementIndex] = matrix[lastYIndex-y][lastYIndex - currentPositionInDiagonalIndex]
                    resultNextElementIndex++
                    currentPositionInDiagonalIndex--
                    y++
                }
            }
            isStartFromTop = !isStartFromTop
        }
        return result;
    }
}