package addTwoNumber;

import lombok.Data;

/**
 * @author: Lingjue
 * @date: 2022/8/9
 * @Description:
 */
@Data
public class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {this.val = val;}

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
