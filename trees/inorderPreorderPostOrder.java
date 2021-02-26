public class inorderPreorderPostOrder {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int d)
        {
            data=d;
        }
    }
    static void inorder(Node root)// ILROR
    {
        if(root!=null)
        {
             inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
        //System.out.println();
    }
    static void preorder(Node root)// PROLR
    {
        if(root!=null)
        {System.out.print(root.data+" ");
             preorder(root.left);
            
            preorder(root.right);
        }
       // System.out.println();
    }
    static void postorder(Node root)// POLRRO
    {
        if(root!=null)
        {
             postorder(root.left);
           
            postorder(root.right);
            System.out.print(root.data+" ");
        }
       // System.out.println();

    }
    public static void main(String[] args) {
        Node root=new Node(1);                            //          1
        root.left=new Node(2);                            //     2         5
        root.left.left=new Node(3);                       //  3    4     6    7
        root.left.right=new Node(4);                      
        root.right=new Node(5);                           //inorder-> 3,2,4,1,6,5,7
        root.right.left=new Node(6);
        root.right.right=new Node(7);                     //preorder->1,2,3,4,5.6.7
                                                          //postorder->3,4,2,6,7,5,1
        System.out.println("Now Inorder: ");
        inorder(root);
        System.out.println("Now Preorder: ");
        preorder(root);
        System.out.println("Now Post order: ");
        postorder(root);

    }
}