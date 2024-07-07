package theory;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Threads {
    public static void main(String[] args) {
        
        var main = Thread.currentThread();
        main.interrupt();// solta InterruptedException mas nao é checked
    }

    void barrier(){
        var service = Executors.newFixedThreadPool(4);

        var c1 = new CyclicBarrier(4);
        var c2 = new CyclicBarrier(4, () -> System.out.println("*** Completed!"));//runnable é quando a bairreira é atingida

        var t = new Threads();

        for (int i = 0; i < 4; i++) service.submit(() -> t.performTask(c1, c2));
    }

    void performTask(CyclicBarrier c1,CyclicBarrier c2) {
        try {
            System.out.println("primeira barreira");
            c1.await();
            System.out.println("segunda barreira");
            c2.await();
        }catch (BrokenBarrierException | InterruptedException e){


        }


    }
    void locks(){
        Lock lock = new ReentrantLock(Boolean.TRUE);
        try{
            lock.tryLock(1, TimeUnit.HOURS);
        }catch (InterruptedException e){

        }
    }
}
