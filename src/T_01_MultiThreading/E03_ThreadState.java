package T_01_MultiThreading;

public class E03_ThreadState extends Thread {
    @Override
    public void run() {
        System.out.println("Running");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        E03_ThreadState t = new E03_ThreadState();
        System.out.println(t.getState());//NEW
        t.start();
        System.out.println(t.getState());  //RUNNABLE
        Thread.sleep(100);
        System.out.println(t.getState());  //TIMED WAITING
        t.join();
        System.out.println(t.getState());  //TERMINATED


    }
}
