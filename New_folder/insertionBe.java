package New_folder;

class Node1 {
    int data;
    Node next;

    Node1(int d) {
        data = d;
    }
}

class insert {
    Node head;

    public void in(int d) {

        Node temp = new Node(d);
        temp.next = head;
        head = temp;

    }

    public void print() {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data);
            cur = cur.next;
        }
    }
}

public class insertionBe {
    public static void main(String[] args) {
        insert l = new insert();
        l.in(5);
        l.in(10);
        l.in(15);
        l.print();
    }
}