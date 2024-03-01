public class SinglyLinkedList {
    Node head;
    Node tail;
    int length;
    public SinglyLinkedList(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }
    public Node addElementAtEnd(Object value){
        Node newNode = new Node(value);
        if(this.head == null){
            this.head = newNode;
            this.tail = newNode;
        }else{
            this.tail.next = newNode;
            this.tail = newNode;
        }
        this.length++;
        return this.tail;
    }




}
