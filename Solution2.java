

    import java.util.*;
    import java.io.*;
    
    class Node{
        int data;
        Node next;
        Node(int x){
            data = x;
            next = null;
        } 
    }
    class Solution2{
        static void printList(Node node) 
        { 
            while (node != null) 
            { 
                System.out.print(node.data + " "); 
                node = node.next; 
            } 
            System.out.println(); 
        }
        public static void main(String args[]) throws IOException { 
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t > 0){
                int n = sc.nextInt();
                Node head = new Node(sc.nextInt());
                Node tail = head;
                for(int i=0; i<n-1; i++)
                {
                    tail.next = new Node(sc.nextInt());
                    tail = tail.next;
                }
                Solution g = new Solution();
                head = g.deleteMid(head);
                printList(head); 
                t--;
            }
        } 
    } 
      
    class Solution {
        Node deleteMid(Node head) {
            if(head==null || head.next==null) return null;
            Node prev=null;
            Node slow = head;
            Node fast= head;
            while(fast.next!=null){
                prev=slow;
                slow=slow.next;
                fast=fast.next.next;
                if(fast==null) break;
            }
            //System.out.println(slow.val);
            prev.next=slow.next;
        return head;
        }
    }