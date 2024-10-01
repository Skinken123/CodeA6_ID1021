public class LinkedListQueue{
    Node head;

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
     */
    public LinkedListQueue(){
        head = null;
    }

    /*
     * Adds a new item to the beginning of the queue
     * The last item in the queue is the one that will be removed first, first in first out principle
     * 
     * @param item, is the item to be added to the list
     */
    public void enqueue(Integer item){
        Node newNode = new Node(item, head);
        head = newNode;
    }

    /*
     * Removes the item at the end of the queue and returns it
     */
    public Integer dequeue(){
        if (head == null) return null;

        Node current = head;
        Node previous = null;
        while(current.next != null){
            previous = current;
            current = current.next;
        }

        if (previous == null) head = null;
        else previous.next = null;

        return current.item;
    }
}