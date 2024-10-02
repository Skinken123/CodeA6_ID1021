public class LinkedListQueueBetter{
    Node head;
    Node tail;

    private class Node{
        Integer item;
        Node next;

        private Node(Integer item, Node list){
            this.item = item;
            this.next = list;
        } 
    }

    /*
     * Constructor of the queue, creating instances of the queue
     * 
     * @param first, when a new queue instance is created it will need a first object in the queue. This is to avoid having to
     * check for if the head is null in every enqueue operation. Since it is the first object it will need to point to a null pointer.
     */
    public LinkedListQueueBetter(){
        head = null;
        tail = null;
    }

    /*
     * Adds a new item to the beginning of the queue
     * The last item in the queue is the one that will be removed first, first in first out principle
     * 
     * @param item, is the item to be added to the list
     */
    public void enqueue(Integer item){
        Node newNode = new Node(item, null);
        if (head == null){ 
            head = newNode; 
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
    }

    /*
     * Removes the item at the end of the queue and returns it
     * If it removes the only item we have a problem since the first Node will now point to the nullpointer and the tail will still 
     * point towards the old head
     */
    public Integer dequeue(){
        if (head == null) return null;
        Node current = head;
        head = current.next;
        return current.item;
    }

    /*
     * Prints the entire queue from the first element in the queue to the last
     */
    public void printQ(){
        Node current = head;
        while(current != null){
            System.out.print(current.item + " \n");
            current = current.next;
        }
        System.out.print("\n");
        return;
    }
}