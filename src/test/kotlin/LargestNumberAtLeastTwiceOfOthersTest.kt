import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class LargestNumberAtLeastTwiceOfOthersTest {

    private val sut = LargestNumberAtLeastTwiceOfOthers()

    /**
     * Input: nums = [3, 6, 1, 0]
     * Output: 1
     * Explanation: 6 is the largest integer, and for every other number in the array x,
     * 6 is more than twice as big as x.  The index of value 6 is 1, so we return 1.
     */
    @Test
    fun dominantIndex_defaultExample1() {
        assertEquals(1, sut.dominantIndex(intArrayOf(3, 6, 1, 0)))
    }


    /**
     * Input: nums = [1, 2, 3, 4]
     * Output: -1
     * Explanation: 4 isn't at least as big as twice the value of 3, so we return -1.
     */
    @Test
    fun dominantIndex_defaultExample2() {
        assertEquals(-1, sut.dominantIndex(intArrayOf(1, 2, 3, 4)))
    }

    /**
     * Input: nums = [0,0,0,1]
     * Output: -3
     */
    @Test
    fun dominantIndex_defaultCheckExample() {
        assertEquals(3, sut.dominantIndex(intArrayOf(0, 0, 0, 1)))
    }
}