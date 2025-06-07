public class SinglyLinkedList {
    public static class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

 Node head=null;
Node tail=null;
void addNode(int data) {
    Node newNode = new Node(data);
    if (head == null) {
        head = newNode;
        tail = newNode;
    } else {
        tail.next = newNode;
        tail = newNode;
    }
  }
  void printList(){
        Node current=head;
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }
    
    public static void main(String[] args) {
        SinglyLinkedList sl=new SinglyLinkedList();
        sl.addNode(10);
        sl.addNode(20);
        sl.addNode(30);
        sl.printList();
    }
    
}

