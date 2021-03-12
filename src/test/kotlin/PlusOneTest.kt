import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class PlusOneTest {

    private val sut = PlusOne()

    /**
     * Input: digits = [1,2,3]
     * Output: [1,2,4]
     * Explanation: The array represents the integer 123.
     */
    @Test
    fun plusOne_defaultExample1() {
        val array = intArrayOf(1, 2, 3)

        val resultArray = sut.plusOne(array)

        assertArrayEquals(intArrayOf(1, 2, 4), resultArray)
    }

    /**
     * Input: digits = [4,3,2,1]
     * Output: [4,3,2,2]
     * Explanation: The array represents the integer 4321.
     */
    @Test
    fun plusOne_defaultExample2() {
        val array = intArrayOf(4, 3, 2, 1)

        val resultArray = sut.plusOne(array)

        assertArrayEquals(intArrayOf(4, 3, 2, 2), resultArray)
    }

    /**
     * Input: digits = [0]
     * Output: [1]
     */
    @Test
    fun plusOne_defaultExample3() {
        val array = intArrayOf(0)

        val resultArray = sut.plusOne(array)

        assertArrayEquals(intArrayOf(1), resultArray)
    }

    /**
     * Input: [9]
     * Expected: [1,0]
     */
    @Test
    fun plusOne_defaultExample4() {
        val array = intArrayOf(9)

        val resultArray = sut.plusOne(array)

        assertArrayEquals(intArrayOf(1, 0), resultArray)
    }
}