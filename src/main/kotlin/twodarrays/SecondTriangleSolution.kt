package twodarrays

class SecondTriangleSolution {

    fun prepare(firstTriangleResult: FirstTriangleDataResponse, matrix: Array<IntArray>) : IntArray {
        val lastXIndex = matrix[0].size
        val lastYIndex = matrix.size
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
                while (j < lastXIndex-1 ) {
                    result[resultNextElementIndex] = matrix[i][lastXIndex - j]
                    resultNextElementIndex++
                    j++
                }
            }
            isStartFromTop = !isStartFromTop
        }
        return result;
    }
}