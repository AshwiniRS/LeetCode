/*Add Two Numbers
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8*/


/******************************************************************************************/
 /*Editorial Solution
  * public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode dummyHead = new ListNode(0);
    ListNode p = l1, q = l2, curr = dummyHead;
    int carry = 0;
    while (p != null || q != null) {
        int x = (p != null) ? p.val : 0;
        int y = (q != null) ? q.val : 0;
        int sum = carry + x + y;
        carry = sum / 10;
        curr.next = new ListNode(sum % 10);
        curr = curr.next;
        if (p != null) p = p.next;
        if (q != null) q = q.next;
    }
    if (carry > 0) {
        curr.next = new ListNode(carry);
    }
    return dummyHead.next;
}

  * O(max(m,n))
  */


class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
 
public class AddTwoLinkedList {
    public ListNode newNode(int x){
        ListNode l = new ListNode(x);
        l.val = x;
        l.next = null;
        return l;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3=null;
        ListNode head=null;
         int carry = 0;
         int sum=0;
        while(l1!=null || l2!=null){
            if(l1==null){
              sum=l2.val+carry;
              l2=l2.next;
            }
            else if(l2==null){
              sum=l1.val+carry;
              l1=l1.next;
            }
            else{
              sum = l1.val+l2.val+carry;
                l1=l1.next;
                l2=l2.next;
            }
            if(sum<=9){
                carry = 0;
                if(l3==null){
                    l3=newNode(sum);
                    head = l3;
                }
                else{
                    l3.next=newNode(sum);
                    l3=l3.next;
                }
            }else{
                carry=sum/10;
                if(l3==null){
                    l3=newNode(sum%10);
                    head=l3;
                }
                else{
                    l3.next=newNode(sum%10);
                    l3=l3.next;
                }
            }
        }
        if(carry>0){
            l3.next=newNode(carry);
        }
        return head;
    }

    
    public static void main(String[] args){
    	ListNode l1 = null;

    	
//    	//int[] result = addTwoNumbers(l1,l2);
//    	System.out.println(result[0] + " " + result[1]);
    }
}