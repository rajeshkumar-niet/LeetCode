/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverse(ListNode head){
        if(head.next == null || head == null){
            return head;
        }

        ListNode P = head;
        ListNode C = head.next;
        while(C!= null){
            ListNode N = C.next;
            C.next = P;
            P = C;
            C = N;
        }
        head.next = null;
        head = P;
        return head;
    }
    public ListNode findMiddle(ListNode head){
        ListNode one = head;
        ListNode two = head;
        while(two != null && two.next != null){
            one = one.next;
            two = two.next.next;
        }
        return one;
    }

    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        ListNode middle = findMiddle(head);
        ListNode secondhalf = reverse(middle);
        ListNode firsthalf = head;
        while(secondhalf != null){
            if(secondhalf.val !=   firsthalf.val){
                return false;
            }
            secondhalf = secondhalf.next;
            firsthalf = firsthalf.next;
        }
        return true;
    }
}