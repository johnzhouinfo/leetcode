package addTwoNumber;

/**
 * @author: Lingjue
 * @date: 2022/8/9
 * @Description:
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = new ListNode();
        ListNode head = result;
        boolean flag = false;
        while (true) {
            ListNode cur = new ListNode();
            ListNode val1 = l1;
            ListNode val2 = l2;
            int currentValue = 0;
            boolean currentFlag = false;
            if (val1 == null && val2 == null && !flag) {
                break;
            }

            head.next = cur;
            head = head.next;
            if (flag) {
                flag = false;
                currentValue += 1;
            }

            if (val1 != null) {
                currentValue += val1.val;
                if (currentValue > 9) {
                    currentFlag = true;
                    currentValue = currentValue % 10;
                }
                l1 = l1.next;
            }
            if (val2 != null) {
                currentValue += val2.val;
                if (currentValue > 9) {
                    currentFlag = true;
                    currentValue = currentValue % 10;
                }
                l2 = l2.next;
            }
            if (currentFlag) {
                flag = true;
            }
            cur.val = currentValue;
        }
        return result.next;
    }

}
