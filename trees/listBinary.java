public class listBinary {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int d)
        {
            data=d;
        }
    }
    static void print(){
        
    }
    public static void main(String[] args) {
      Node root=new Node(10);
      root.left=new Node(11);
      root.right=new Node(12);
      root.left.left=new Node(13);
      root.right.right=new Node(14);
      print();

    }
}