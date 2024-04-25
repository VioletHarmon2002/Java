package moduuli13.task2;

public class SafeListTest {

    public static void main(String[] args) {
        SafeList<String> safeList = new SafeList<>();

        Thread writerThread = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                safeList.addItem("Element " + i);
            }
        });

        Thread readerThread = new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                System.out.println("Size: " + safeList.getSize());
            }
        });

        Thread removerThread = new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                safeList.removeItem("Element " + i);
            }
        });

        writerThread.start();
        readerThread.start();
        removerThread.start();

        try {
            writerThread.join();
            readerThread.join();
            removerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final size: " + safeList.getSize());
    }
}
