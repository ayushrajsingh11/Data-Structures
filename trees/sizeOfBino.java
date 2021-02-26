public class sizeOfBino {
    static class Node{
        int data;
        Node left;Node right;
        Node(int d)
        {
        data=d;
        }
      }
      static int height(Node root)
      {
          if(root==null)
          return 0;
          else
          return (1+ height(root.left)+height(root.right));
      }
      public static void main(String[] args) {
        Node root=new Node(1);                            //          1
        root.left=new Node(2);                            //     2         5
        root.left.left=new Node(3);                       //  3    4     6    7
        root.left.right=new Node(4);                      
        root.right=new Node(5);                           //inorder-> 3,2,4,1,6,5,7
        root.right.left=new Node(6);
        root.right.right=new Node(7);
       System.out.println(height(root));
      }
}