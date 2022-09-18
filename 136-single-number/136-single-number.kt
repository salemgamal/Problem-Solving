class Solution {
    fun singleNumber(nums: IntArray): Int {
      var result = 0
      for (n in nums) {
        result = n.xor(result)
      }
      return result 
    }
}
