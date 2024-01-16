package labs;

public class EvenOddPrintExample {

    public static void main(String[] args) {
        // Creating two threads, one for even numbers and one for odd numbers
        Thread evenThread = new Thread(new EvenNumberPrinter());
        Thread oddThread = new Thread(new OddNumberPrinter());

        // Starting the threads
        evenThread.start();
        oddThread.start();
    }

    private static class EvenNumberPrinter implements Runnable {
        @Override
        public void run() {
            for (int i = 2; i <= 20; i += 2) {
                System.out.println("Even idgg Thread: " + i);

                try {
                    // Introduce a small delay for better visibility
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static class OddNumberPrinter implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 19; i += 2) {
                System.out.println("Odd Thread: " + i);

                try {
                    // Introduce a small delay for better visibility
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
