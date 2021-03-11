/**
 * In a given integer array nums, there is always exactly one largest element.
 *
 * Find whether the largest element in the array is at least twice as much as every other number in the array.
 *
 * If it is, return the index of the largest element, otherwise return -1.
 *
 * Note:
 * nums will have a length in the range [1, 50]. Every nums[ i ] will be an integer in the range [0, 99].
 */
class LargestNumberAtLeastTwiceOfOthers {

    fun dominantIndex(nums: IntArray): Int {
        val maxArrayIndexedValue = findMaxIndexedValue(nums)
        return if (isMaxElementAtLeastTwiceOfOthers(nums, maxArrayIndexedValue)) {
            maxArrayIndexedValue.index
        } else -1
    }

    private fun findMaxIndexedValue(nums: IntArray): IndexedValue<Int> {
        var max = IndexedValue(0, 0)
        for (indexedValue in nums.withIndex()) {
            if (indexedValue.value > max.value) {
                max = indexedValue
            }
        }
        return max
    }

    private fun isMaxElementAtLeastTwiceOfOthers(nums: IntArray, maxIndexedValue: IndexedValue<Int>): Boolean
    {
        for (indexedValue in nums.withIndex()) {
            if (indexedValue.value * 2 > maxIndexedValue.value
                && indexedValue.index != maxIndexedValue.index
            ) {
                return false
            }
        }
        return true
    }
}