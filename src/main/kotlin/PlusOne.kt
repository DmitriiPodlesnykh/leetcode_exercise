/**
 * Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer.
 *
 * The digits are stored such that the most
 * significant digit is at the head of the list, and each element in the array contains a single digit.
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 *
 * Constraints:
 * 1 <= digits.length <= 100
 * 0 <= digits[ i ] <= 9
 */
class PlusOne {

    fun plusOne(digits: IntArray): IntArray {
        return if (digits.last() == 9) {
            resizeArray(digits)
        } else {
            digits[digits.size - 1] += 1
            digits
        }
    }

    private fun resizeArray(digits: IntArray): IntArray {
        val newArray = IntArray(digits.size + 1)
        for (i in digits.indices) {
            newArray[i] = digits[i]
        }
        newArray[newArray.size - 2] = 1
        newArray[newArray.size - 1] = 0
        return newArray
    }
}