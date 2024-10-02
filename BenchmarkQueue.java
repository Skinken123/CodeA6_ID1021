public class BenchmarkQueue {
    public static void main(String[] args){
        benchQueue();

        System.out.print("\n");

        benchQueueBetter();
    }

    private static void benchQueue(){
        int[] elementsToPop = {100, 200, 400, 800, 1600};
        int k = 1000;

        for (int n : elementsToPop){
            long min = Long.MAX_VALUE;
            long total = 0;
            for (int i = 0; i < k; i++){
                long temp = runQ(n);
                if (temp < min) min = temp;
                total += temp;
            }
            System.out.print(n + " " + min + " " + total/k + "\n");
        }
    }

    private static long runQ(int n){
        LinkedListQueue queue = new LinkedListQueue(); 
        long n0 = System.nanoTime();
        for(int i = 0; i < n; i++){
            queue.enqueue(i);
        }
        for(int i = 0; i < n; i++){
            queue.dequeue();
        }
        long n1 = System.nanoTime();
        return n1-n0;
    }

    private static void benchQueueBetter(){
        int[] elementsToPop = {100, 200, 400, 800, 1600};
        int k = 10000;

        for (int n : elementsToPop){
            long min = Long.MAX_VALUE;
            long total = 0;
            for (int i = 0; i < k; i++){
                long temp = runQB(n);
                if (temp < min) min = temp;
                total += temp;
            }
            System.out.print(n + " " + min + " " + total/k + "\n");
        }
    }

    private static long runQB(int n){
        LinkedListQueueBetter queue = new LinkedListQueueBetter(); 
        long n0 = System.nanoTime();
        for(int i = 0; i < n; i++){
            queue.enqueue(i);
        }
        for(int i = 0; i < n; i++){
            queue.dequeue();
        }
        long n1 = System.nanoTime();
        return n1-n0;
    }
}
