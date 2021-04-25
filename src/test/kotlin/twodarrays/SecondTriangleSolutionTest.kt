package twodarrays

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SecondTriangleSolutionTest {

    private val sut = SecondTriangleSolution()

    @Test
    fun prepare_3x3() {
        val request: Array<IntArray> = arrayOf(
            intArrayOf(0, 0, 0),
            intArrayOf(0, 0, 6),
            intArrayOf(0, 8, 9),
        )
        val resultNextIndexedValue = 6
        val isStartFromTop = true
        val fistTriangleDataResponse: FirstTriangleDataResponse =
            prepareFirstTriangleDataResponse(isStartFromTop, request, resultNextIndexedValue)

        val actualResult: IntArray = sut.prepare(fistTriangleDataResponse, request);

        assertArrayEquals(intArrayOf(0, 0, 0, 0, 0, 0, 6, 8, 9), actualResult)
    }

    @Test
    fun prepare_2x2() {
        val request: Array<IntArray> = arrayOf(
            intArrayOf(0, 0),
            intArrayOf(0, 4)
        )

        val resultNextIndexedValue = 3
        val isStartFromTop = false
        val fistTriangleDataResponse: FirstTriangleDataResponse =
            prepareFirstTriangleDataResponse(isStartFromTop, request, resultNextIndexedValue)

        val actualResult: IntArray = sut.prepare(fistTriangleDataResponse, request);

        assertArrayEquals(intArrayOf(0, 0, 0, 4), actualResult)
    }

    @Test
    fun prepare_5x5() {
        val request: Array<IntArray> = arrayOf(
            intArrayOf(0, 0, 0, 0, 0),
            intArrayOf(0, 0, 0, 0, 10),
            intArrayOf(0, 0, 0, 14, 15),
            intArrayOf(0, 0, 18, 19, 20),
            intArrayOf(0, 22, 23, 24, 25)
        )

        val resultArray =
            intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 14, 18, 22, 23, 19, 15, 20, 24, 25)

        val resultNextIndexedValue = 16
        val isStartFromTop = true
        val fistTriangleDataResponse: FirstTriangleDataResponse =
            prepareFirstTriangleDataResponse(isStartFromTop, request, resultNextIndexedValue)

        val actualResult: IntArray = sut.prepare(fistTriangleDataResponse, request);

        assertArrayEquals(resultArray, actualResult)
    }

    private fun prepareFirstTriangleDataResponse(
        isStartFromTop: Boolean, request: Array<IntArray>, resultNextIndexedValue: Int
    ): FirstTriangleDataResponse {
        val lastXIndex = request[0].size
        val lastYIndex = request.size
        var result = IntArray(lastXIndex * lastYIndex)

        return FirstTriangleDataResponse(isStartFromTop, result, resultNextIndexedValue)
    }
}