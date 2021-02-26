public class burnBinaryTree {
    static class Node{
        int data;
        Node left;Node right;//left as prev andright as next
        Node(int d)
        {
        data=d;
        }
      }
      static  int burn(Node root)
      {
          if(root==null)
          return 0;
         // Node cur=new Node(del);
          int lh=burn(root.left);

          int ro=burn(root.right);
          return 1+Math.max(lh,ro);
      }
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
         root.left.left=new Node(30);
         root.left.left.right=new Node(50);
         root.left.left.left=new Node(40);
         root.left.left.left.left=new Node(60);
         root.left.left.left.left.left=new Node(70);
         System.out.println(burn(new Node(50)));

    }
}