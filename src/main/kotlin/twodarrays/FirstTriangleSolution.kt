package twodarrays;

class FirstTriangleSolution {

    fun prepare(matrix: Array<IntArray>): DiagonalTraverseSolution.TriangleData {
        val lastXIndex = matrix[0].size
        val lastYIndex = matrix.size
        var result = IntArray(lastXIndex * lastYIndex)
        var isStartFromTop = false
        var resultNextElementIndex = 0
        for (currentDiagonalIndex in 0 until lastYIndex) {
            if (isStartFromTop) {
                var currentPositionInDiagonalIndex = 0
                while (currentPositionInDiagonalIndex <= currentDiagonalIndex) {
                    result[resultNextElementIndex] =
                        matrix[currentPositionInDiagonalIndex][currentDiagonalIndex - currentPositionInDiagonalIndex]
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
        return DiagonalTraverseSolution.TriangleData(isStartFromTop, result, resultNextElementIndex);
    }
}
