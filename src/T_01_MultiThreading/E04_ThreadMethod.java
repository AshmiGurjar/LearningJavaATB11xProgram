package T_01_MultiThreading;

import javax.swing.plaf.TableHeaderUI;
import java.time.chrono.ThaiBuddhistEra;

public class E04_ThreadMethod extends Thread{


    @Override
    public void run() {
        for (int i = 0; i <= 2; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        E04_ThreadMethod t1 = new E04_ThreadMethod();
        t1.start();
    }
} 