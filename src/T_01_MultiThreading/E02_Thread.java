package T_01_MultiThreading;

public class E02_Thread {
    public static void main(String[] args) {

        ThreadGroup threadGroup= new ThreadGroup("Workers");
        Worker w1=new Worker(threadGroup,"W1");
        w1.start();

        Worker w2=new Worker(threadGroup,"W2");
        w2.start();
    }

    //Thread by class
    static class Worker extends Thread{
        public Worker(ThreadGroup threadGroup, String w1) {
        }

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(2000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
