public class binaryTreeFromInorderAndPreorder {
    static int preIndex=0;
    static class Node{
        int data;
        Node left;Node right;//left as prev andright as next
        Node(int d)
        {
        data=d;
        }
      }
    static Node tree(int[] in,int[] pre,int is,int ie)
    {
        if(is>ie)
        {
         return null;
        }
        Node root=new Node(pre[preIndex++]);
        int dex=0;
        for(int i=0;i<ie;i++)
        {
            if(root.data==in[i])
            {
          dex=i;
          break;
            }
        }
        root.left=tree(in, pre, is, dex-1);
        root.right=tree(in, pre, dex+1, ie);
        return root;

    }
    static void print(Node root)
    {
     if(root==null)
     return;
     else
     {
      System.out.println(root.data+" ");
      print(root.left);
      print(root.right);
     }
    }
    public static void main(String[] args) {
        int[] in=new int[]{40,20,50,10,30,80,70,90};
        int[] pre=new int[]{10,20,40,50,30,70,80,90};
        int end=in.length;
        Node head=tree(in,pre,0,end);
       // print(head);
    }
}