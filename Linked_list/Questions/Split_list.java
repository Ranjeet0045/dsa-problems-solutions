package Linked_list.Questions;

class ListNode{
    int val;
    ListNode next;
    public ListNode(int val,ListNode next){
        this.val = val;   // We create this class so that we can define the building block(node) of a 
        this.next = next; // linked list, which is necessary for solving any linked list problem.
    }                     // And this will be created in every linked list question...
    public ListNode(int val){
        this.val = val;
    }
}

public class Split_list {

    static ListNode[] splitListToParts(ListNode head, int k) {
        ListNode curr = head;
        int count = 0;

        while(curr != null){
            curr = curr.next;
            count++;
        }

        curr = head;
        int size = count / k;
        int extra = count % k;

        ListNode[] result = new ListNode[k];
        ListNode prev = null;

        for (int i = 0; i < k; i++) {
            result[i] = curr;

            for(int j=1; j<=size + (extra>0 ? 1 : 0); j++){
                prev = curr;
                curr = curr.next;
            }
            if(prev != null){
                prev.next = null;
            }
            if (extra > 0) extra--;
        }
        
        return result;
    }
    public static void main(String[] args) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        for (int val : arr) {
            tail.next = new ListNode(val);
            tail = tail.next;
        }

        ListNode head = dummy.next;
        int k = 3;

        ListNode[] ans = splitListToParts(head,k);

        for(ListNode list : ans){
            ListNode temp = list;
            while (temp != null) {
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            }
            System.out.print("null");
            System.out.println();
        }

    }
}
