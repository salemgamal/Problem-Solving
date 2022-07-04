class Solution {
    fun isPalindrome(x: Int): Boolean {
        var s = x.toString()
        var left = 0
        var right = s.length - 1
        
        if (x<0){
            return false
        } 
        while (left < right) {
            if (s[left] == s[right]) {
                left++
                right--
            } else {
                return false
            }       
        }
        
        return true
    }
}
