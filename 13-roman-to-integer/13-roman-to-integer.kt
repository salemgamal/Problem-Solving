class Solution {
    fun romanToInt(s: String): Int {
        val m = mapOf('I' to 1, 'V' to 5, 
    'X' to 10, 'L' to 50, 'C' to 100, 'D' to 500, 'M' to 1000)
        
        var b = 0
        var i = 0
        while (i < s.length) {
            if (i == s.length-1) {
                b += m[s[i]]!!
                break
            }
            if (m[s[i]]!! < m[s[i+1]]!!) {
                b += m[s[i+1]]!!-m[s[i]]!!
                i += 2
            } else {
                b += m[s[i]]!!
                i++
            }
        }
        return b
    }
}