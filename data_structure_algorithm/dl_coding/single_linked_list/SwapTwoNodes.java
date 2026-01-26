class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SwapTwoNodes {
    Node head;
    public void add(int data) {
        Node newNode = newNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
    public void swap(){
        if (head == null | head.next == null) {
            return;
        
        }

        Node first = head;
        Node second = head.next;
        first.next = second.next;
        second.next = first;
        head = second;

        while (first.next != null && first.next.next != null) {
            Node temp = first.next;
            first.next = first.next.next;
            temp.next = first.next.next;
            first.next.next = temp;
            first = temp;
        }

    }

}