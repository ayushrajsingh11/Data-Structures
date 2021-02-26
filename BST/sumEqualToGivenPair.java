import java.util.*;
public class sumEqualToGivenPair {
    //static ArrayList<Integer> a=new ArrayList<>();
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int d)
         {
             data=d;
         }
    }
    static boolean su(Node root,int sum,HashSet<Integer> h)
    {
      if(root==null)
      return false;
      if(su(root.left,sum,h)==true)
      return true;
    if(h.contains(sum-root.data))
    {System.out.print(" Pair is found: "+(sum-root.data)+","+root.data);
    return true;
    }
    else
    h.add(root.data);
    return su(root.right,sum,h);
      
    }
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(5);
        root.right=new Node(20);
       // root.left.right=new Node(40);
       // root.left.left.right=new Node(18);
       // root.left.left.left=new Node(7);
        root.right.right=new Node(40);
        root.right.left=new Node(16);
        HashSet<Integer> h=new HashSet<>();
        if(su(root,21,h))
        System.out.print("yes");
        else
        System.out.print("no");
    }
}