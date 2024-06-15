package LinkedList;

public class SinglyLinkedList {
    Node head;
    private int size;
    SinglyLinkedList(){
        size = 0;
    }
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    public void deleteFirst(){
        size--;
        if(head == null){
            System.out.println("List is empty.");
        }

        head = head.next;
    }

    public void deleteLast(){
        size--;
        if(head == null){
            System.out.println("List is empty.");
        }

        if(head.next == null){
            head = null;
        }

        Node lastNode = head.next;
        Node secondlastNode = head;

        while(lastNode.next != null){
            secondlastNode = secondlastNode.next;
            lastNode = lastNode.next;
        }

        secondlastNode.next = null;
    }

    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    public int getSize(){
        return size;
    }
    public static void main(String args[]){
        SinglyLinkedList list = new SinglyLinkedList();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();
        list.addFirst("This");
        list.addLast("List");
        list.printList();
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();
        System.out.println(list.getSize());
        list.addFirst("this");
        System.out.println(list.getSize());
    }
}
