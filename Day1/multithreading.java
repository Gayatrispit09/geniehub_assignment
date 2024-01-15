public class multithreading {
    public static void main(String[] args) {
        new Thread(() -> printCounts("Thread", 5)).start();
        printCounts("Main", 5);
    }

    private static void printCounts(String threadName, int count) {
        for (int i = 1; i <= count; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + threadName + " Count " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
