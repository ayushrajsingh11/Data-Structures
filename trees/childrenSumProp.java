import java.util.*;
public class childrenSumProp {
    static class Node{
        int data;
        Node left;Node right;
        Node(int d)
        {
        data=d;
        }
      }
      static boolean children(Node root)
      {
        if(root==null)
        return true;
        if(root.left==null&&root.right==null)
        return true;
        int s=0;
        if(root.left!=null)
        s+=root.left.data;
        if(root.right!=null)
        s+=root.right.data;
        return (s==root.data&&children(root.left)&&children(root.right));

      }
    public static void main(String[] args) {
        Node root=new Node(10);                            //          10
        root.left=new Node(8);                            //     8         2
        root.left.left=new Node(4);                       //  4    4     1    1
        root.left.right=new Node(4);                      
        root.right=new Node(2);                           //inorder-> 3,2,4,1,6,5,7
        root.right.left=new Node(1);
        root.right.right=new Node(1);
        if(children(root))
        System.out.println("yes");
        else
        System.out.println("po");
    }
}