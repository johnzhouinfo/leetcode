package containsDuplicate;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: Lingjue
 * @date: 2022/8/9
 * @Description:
 */
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> uniqueSet = new HashSet<>();
        for (Integer x : nums) {
            uniqueSet.add(x);
        }
        return uniqueSet.size() != nums.length;
    }
}
