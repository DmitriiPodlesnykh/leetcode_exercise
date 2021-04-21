package twodarrays

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class DiagonalTraverseSolutionTest {

    private val sut = DiagonalTraverseSolution()

    @Test
    fun findDiagonalOrder_defaultExample1() {
        val request: Array<IntArray> = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(4, 5, 6),
            intArrayOf(7, 8, 9),
        )

        assertArrayEquals(intArrayOf(1, 2, 4, 7, 5, 3, 6, 8, 9), sut.findDiagonalOrder(request))
    }

    /**
     * Custom example
     */
    @Test
    fun findDiagonalOrder_2x2matrix_returnCorrectResultArray() {
        val request: Array<IntArray> = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(3, 4)
        )

        assertArrayEquals(intArrayOf(1, 2, 3, 4), sut.findDiagonalOrder(request))
    }

    /**
     * Custom example
     *
     * matrix [[]]
     *
     * response []
     */
    @Test
    fun findDiagonalOrder_emptyMatrix_returnEmptyArray() {

        assertArrayEquals(intArrayOf(), sut.findDiagonalOrder(arrayOf()))
    }

    /**
     * Custom example
     */
    @Test
    fun findDiagonalOrder_oneLineMatrix_returnCorrectArray() {
        val request: Array<IntArray> = arrayOf(intArrayOf(1, 2))
        assertArrayEquals(intArrayOf(1, 2), sut.findDiagonalOrder(request))
    }

    /**
     * Custom example
     */
    @Test
    fun findDiagonalOrder_oneLineThreeElementsMatrix_returnCorrectArray() {
        val request: Array<IntArray> = arrayOf(intArrayOf(1, 2, 3))
        assertArrayEquals(intArrayOf(1, 2, 3), sut.findDiagonalOrder(request))
    }

    @Test
    fun findDiagonalOrder_oneColumnMatrix_returnCorrectArray() {
        val request: Array<IntArray> = arrayOf(
            intArrayOf(1),
            intArrayOf(2)
        )
        assertArrayEquals(intArrayOf(1, 2), sut.findDiagonalOrder(request))
    }

    @Test
    fun findDiagonalOrder_4x4_returnCorrectArray() {
        val request: Array<IntArray> = arrayOf(
            intArrayOf(1, 2, 3, 4),
            intArrayOf(5, 6, 7, 8),
            intArrayOf(9, 10, 11, 12),
            intArrayOf(13, 14, 15, 16),
        )

        assertArrayEquals(
            intArrayOf(1, 2, 5, 9, 6, 3, 4, 7, 10, 13, 14, 11, 8, 12, 15, 16),
            sut.findDiagonalOrder(request))
    }

}