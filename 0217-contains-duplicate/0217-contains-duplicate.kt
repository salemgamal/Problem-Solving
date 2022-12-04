class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        var ans = false
        var set : MutableSet<Int> = mutableSetOf()
        for (i in 0 .. nums.size -1){
            if (set.contains(nums[i]) ){
                ans =  true
            }else{
                set.add(nums[i])
            }
        }
        
        return ans
    }
}