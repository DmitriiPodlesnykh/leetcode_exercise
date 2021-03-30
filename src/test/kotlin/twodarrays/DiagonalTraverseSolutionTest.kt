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

}