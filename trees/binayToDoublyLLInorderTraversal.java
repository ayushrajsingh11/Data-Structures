public class binayToDoublyLLInorderTraversal {
    static Node prev=null;
    static class Node{
        int data;
        Node left;Node right;//left as prev andright as next
        Node(int d)
        {
        data=d;
        }
      }
      static Node doubly(Node root)
      { 
          if(root==null)
          return root;
          Node head=doubly(root.left);
          if(prev==null)
          head=root;
          else
          {
            root.left=prev;
            prev.right=root;
          }
          prev=root;//maintained prev value of root
          doubly(root.right);
          return head;

      }
    public static void main(String[] args) {
        Node root=new Node(10);                            //          10
        root.left=new Node(20);                            //     8         2
        root.left.left=new Node(40); 
        root.left.left.left=new Node(40);                 //  4         1    1
        //root.left.right=new Node(6);                   // 5 
        root.right=new Node(30);                           //inorder-> 3,2,4,1,6,5,7
        root.right.left=new Node(1);
        root.right.right=new Node(7);
        //root.right.right.right=new Node(6);
        Node cur=doubly(root);
        while(cur!=null)
        {
            System.out.print(cur.data);
            cur=cur.right;
        }
    }
}