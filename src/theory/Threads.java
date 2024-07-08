package theory;

import javax.lang.model.type.ExecutableType;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Threads {
    public static void main(String[] args) {

        Collectors.toConcurrentMap((String a)-> a.length(),v->v,(v1,v2)-> v1 + "," + v2);
        Collectors.groupingByConcurrent(String::length); // as duas collections que suportam parallel reduction no collect

        var main = Thread.currentThread();
        main.interrupt();// solta InterruptedException mas nao é checked
    }

    void syncLists(){
        List<Integer> ints = new ArrayList<>(List.of(1,2,3,4));
        //for(Integer i : ints) ints.remove(0);-> ConcurrentModificationException


        CopyOnWriteArrayList<Integer> copylist = new CopyOnWriteArrayList<>(ints);
        List<Integer> list = new CopyOnWriteArrayList<>(ints);

        for(Integer i : list){
            list.remove(0);
            System.out.println("Copy :" + list.size());//numero de iteraçoes se mantem, mas se vc der um list.size ja muda, consume mt memoria
        }

        List<Integer> staticFactory = Collections.synchronizedList(new ArrayList<>(List.of(1,2)));

        //for(Integer i : staticFactory) staticFactory.remove(0);

        Collections.synchronizedList(new ArrayList<>());//converter collection normal para concurrent

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
