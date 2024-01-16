package labs;
public class MultiThreadExample {

    public static void main(String[] args) {
        // Creating two threads
        Thread thread1 = new Thread(new MyRunnable("Thread 1"));
        Thread thread2 = new Thread(new MyRunnable("Thread 2"));

        // Start the threads
        thread1.start();
        thread2.start();
    }

    // Custom runnable class implementing Runnable
    private static class MyRunnable implements Runnable {
        private final String name;

        public MyRunnable(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(name + " - Count: " + i);

                try {
                    // Simulate some work by sleeping the thread
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
