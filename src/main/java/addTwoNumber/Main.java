package addTwoNumber;

/**
 * @author: Lingjue
 * @date: 2022/8/9
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        Solution solution = new Solution();
        ListNode result = solution.addTwoNumbers(l1, l2);
        System.out.println(result);
    }
}
