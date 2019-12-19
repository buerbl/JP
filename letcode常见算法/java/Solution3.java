import java.util.HashSet;
import java.util.Set;

/**
 * @Description:
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 *
 * 输入: "bbbbb"
 * 输出: 1
 *
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 *
 * @Author: boolean
 * @Date: 2019/12/19 14:40
 */

public class Solution3 {
    public int lengthOfLongestSubstring1(String s) {
        /**
         * 暴力法
         *
         * 1. 两次循环依次逐个寻找子串
         * 2. 判断每一个子串是否符合条件
         *      2.1 若符合，比较原来的最长不重复子串的大小，保留最大值
         *      2.2 若不符合，进行下一次循环判断
         * 3. 如何判断？
         *      3.1 利用 Set
         */
        int n = s.length();
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j <=n; j++) {
                    if (getCurMaxString1(s, i, j)){
                        max = Math.max(j - i , max);
                    }
            }
        }
        return max;

    }

    private boolean getCurMaxString1(String s, int i, int j) {
        Set<Character> set = new HashSet<>();
        for (int k = i; k < j; k++) {
            if (set.contains(s.charAt(k))){
                return false;
            }
            set.add(s.charAt(k));
        }
        return true;
    }

    /**
     *
     * @param s
     * @return
     */
//    public int lengthOfLongestSubstring(String s) {
//
//    }

}



