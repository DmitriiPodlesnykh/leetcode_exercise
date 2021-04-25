package twodarrays

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class FirstTriangleSolutionTest {

    private val sut = FirstTriangleSolution()

    @Test
    fun prepare_3x3() {
        val request: Array<IntArray> = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(4, 5),
            intArrayOf(7),
        )

        val actualResultWithoutEmptyElements: IntArray = sut.prepare(request).result
            .filter { i -> i != 0 }
            .toIntArray()

        assertArrayEquals(intArrayOf(1, 2, 4, 7, 5, 3), actualResultWithoutEmptyElements)
    }

    @Test
    fun prepare_2x2() {
        val request: Array<IntArray> = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(3)
        )

        val actualResultWithoutEmptyElements: IntArray = sut.prepare(request).result
            .filter { i -> i != 0 }
            .toIntArray()

        assertArrayEquals(intArrayOf(1, 2, 3), actualResultWithoutEmptyElements)
    }

    @Test
    fun prepare_5x5() {
        val request: Array<IntArray> = arrayOf(
            intArrayOf(1, 2, 3, 4, 5),
            intArrayOf(6, 7, 8, 9),
            intArrayOf(11, 12, 13),
            intArrayOf(16, 17),
            intArrayOf(21)
        )
        val expectedResultArray =
            intArrayOf(1, 2, 6, 11, 7, 3, 4, 8, 12, 16, 21, 17, 13, 9, 5)

        val actualResultWithoutEmptyElements: IntArray = sut.prepare(request).result
            .filter { i -> i != 0 }
            .toIntArray()
        assertArrayEquals(expectedResultArray, actualResultWithoutEmptyElements)
    }


}