public class TestArrayQ {
    public static void main(String[] args){
        ArrayQ<Integer> newArrayQueue = new ArrayQ<Integer>(5);
        newArrayQueue.enqueue(1);
        newArrayQueue.enqueue(2);
        newArrayQueue.enqueue(3);
        newArrayQueue.enqueue(4);
        newArrayQueue.printQueue();
        
        System.out.print("\n");
        System.out.print("\n");

        newArrayQueue.dequeue();
        newArrayQueue.dequeue();
        newArrayQueue.dequeue();
        newArrayQueue.dequeue();
        newArrayQueue.dequeue();
         /*
        newArrayQueue.dequeue();
        newArrayQueue.dequeue();
        newArrayQueue.printQueue();

        System.out.print("\n");
        System.out.print("\n");

        newArrayQueue.enqueue(5);
        newArrayQueue.enqueue(6);
        newArrayQueue.printQueue();

        System.out.print("\n");
        System.out.print("\n");

        newArrayQueue.dequeue();
        newArrayQueue.dequeue();
        newArrayQueue.printQueue();

        System.out.print("\n");
        System.out.print("\n");

        newArrayQueue.enqueue(7);
        newArrayQueue.enqueue(8);
        newArrayQueue.enqueue(9);
        newArrayQueue.enqueue(10);
        newArrayQueue.printQueue();

        
        System.out.print("\n");
        System.out.print("\n");

        newArrayQueue.dequeue();
        newArrayQueue.dequeue();
        newArrayQueue.printQueue();

        System.out.print("\n");
        System.out.print("\n");
        System.out.print("__________________________________________________________________________");
         */
    }
}
