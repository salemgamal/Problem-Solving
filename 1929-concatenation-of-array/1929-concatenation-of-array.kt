class Solution {
    fun getConcatenation(nums: IntArray): IntArray {
        val size = nums.size
        val ans = IntArray(2*size)
        for ( i in 0.. size-1){
            ans[i]=nums[i]
            ans[i+size]=nums[i]
        }
        return ans
    }
}