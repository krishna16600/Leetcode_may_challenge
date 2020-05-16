/*
Given a singly linked list, group all odd nodes together followed by the even nodes. Please note here we are talking about the node number and not the value in the nodes.

You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.
 */

class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class oddEveneLinkedList {
    public ListNode oddEvenList(ListNode head) {
        ListNode evenHead = null;
        ListNode evenTail = null;
        ListNode oddHead = null;
        ListNode oddTail = null;
        int count = 1;
        while(head!=null){
            if(count%2==0){
                if(evenHead==null){
                    evenHead = head;
                    evenTail = head;
                }else{
                    evenTail.next = head;
                    evenTail = evenTail.next;
                }
            }else{
                if(oddHead==null){
                    oddHead = head;
                    oddTail = head;
                }else{
                    oddTail.next = head;
                    oddTail = oddTail.next;
                }
            }
            head = head.next;
            count++;
        }

        if(oddHead==null)
            return evenHead;
        else
            oddTail.next = evenHead;

        if(evenHead!=null)
            evenTail.next = null;

        return oddHead;

    }
}
