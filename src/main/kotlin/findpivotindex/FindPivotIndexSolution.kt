package findpivotindex

/**
 * Given an array of integers nums, calculate the pivot index of this array.
 *
 * The pivot index is the index where the sum of all the numbers strictly to the left of the index
 * is equal to the sum of all the numbers strictly to the index's right.
 *
 * If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left.
 * This also applies to the right edge of the array.
 *
 * Return the leftmost pivot index. If no such index exists, return -1.
 *
 * Constraints:
 * 1 <= nums.length <= 104
 * -1000 <= nums[ i ] <= 1000
 */
class FindPivotIndexSolution {

    fun pivotIndex(nums: IntArray): Int {
        var leftSideSum = sumArrayWithoutLastElement(nums)
        var rightSideSum = 0
        for (index in nums.size - 1 downTo 0) {
            if (leftSideSum == rightSideSum) {
                return index
            } else if (index == 0) {
                return -1
            }
            leftSideSum -= nums[index - 1]
            rightSideSum += nums[index]
        }
        return -1
    }
}

private fun sumArrayWithoutLastElement(nums: IntArray): Int {
    return nums.withIndex()
        .filter { iv -> iv.index < nums.lastIndex }
        .map { indexedValue -> indexedValue.value }
        .sum()
}