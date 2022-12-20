
import java.util.*;
class Node 
{
    int data;
    Node next;    
    Node(int a)
        {
            data = a;
            next = null;
        }
}
class Solution1
{
    static Scanner sc = new Scanner(System.in);
    
    public static Node inputList(int size)
    {
        Node head, tail;
        int val;
        
        val = sc.nextInt();
        head = tail = new Node(val);
        
        size--;
        while(size-->0)
        {
            val = sc.nextInt();
            tail.next = new Node(val);
            tail = tail.next;
        }
        
        return head;
    }
    
    public static void printList(Node n)
    {
        while(n!=null)
        {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
    
    public static void main(String args[])
    {
        int t = sc.nextInt();
        while(t-->0)
        {
            int n , m;
            
            n = sc.nextInt();
            Node head1 = inputList(n);
            
            m = sc.nextInt();
            Node head2 = inputList(m);
            
            Solution obj = new Solution();
            
            Node result = obj.findIntersection(head1, head2);
            
            printList(result);
            System.out.println();
        }
    }
}


class Solution
{
    public static Node findIntersection(Node root1, Node root2)
    {
        Node head=new Node(-1);
        Node temp=head;
        HashMap<Integer,Integer>map=new HashMap<>();
        while(root1!=null){
            map.put(root1.data, root1.data);
            root1=root1.next;
        }
        while(root2!=null){
            if(map.containsKey(root2.data)){
                temp.next=new Node(root2.data);
                temp=temp.next;
                map.remove(root2.data);
            }
            root2=root2.next;
        }
        return head.next;
    }
}