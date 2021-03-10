package findpivotindex

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class FindPivotIndexSolutionTest {

    private val sut = FindPivotIndexSolution()

    /**
     * Input: nums = [1,7,3,6,5,6]
     * Output: 3
     * Explanation:
     * The pivot index is 3.
     * Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
     * Right sum = nums[4] + nums[5] = 5 + 6 = 11
     */
    @Test
    fun pivotIndex_defaultExample1() {
        val inputArray = intArrayOf(1, 7, 3, 6, 5, 6)
        assertEquals(3, sut.pivotIndex(inputArray))
    }

    /**
     * Input: nums = [1,2,3]
     * Output: -1
     * Explanation:
     * There is no index that satisfies the conditions in the problem statement.
     */
    @Test
    fun pivotIndex_defaultExample2() {
        val inputArray = intArrayOf(1, 2, 3)
        assertEquals(-1, sut.pivotIndex(inputArray))
    }

    /**
     * Input: nums = [2,1,-1]
     * Output: 0
     * Explanation:
     * The pivot index is 0.
     * Left sum = 0 (no elements to the left of index 0)
     * Right sum = nums[1] + nums[2] = 1 + -1 = 0
     */
    @Test
    fun pivotIndex_defaultExample3() {
        val inputArray = intArrayOf(2, 1, -1)
        assertEquals(0, sut.pivotIndex(inputArray))
    }

}