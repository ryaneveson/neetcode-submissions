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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // create a new list and initiate a node that points to it
        ListNode second = new ListNode(0);
        ListNode node = second;
        while(list1!= null && list2 != null){
                if(list1.val < list2.val){
                    node.next = list1;
                    list1 = list1.next;
                } else {
                    node.next = list2;
                    list2 = list2.next;
                }
                node = node.next;
        }
        // the while loop will stop when one of them becomes null. this makes sure that the last node is added to the list.
        if(list1 != null){
            node.next = list1;
        } else {
            node.next = list2;
        }
        // return the entire array, we do not jsut want to return the node that we have been using.
        return second.next;
    }
}