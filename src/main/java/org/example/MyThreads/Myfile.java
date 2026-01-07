package org.example.MyThreads;

public class Myfile implements Runnable {

    public void run(){
        for(int i = 1; i <= 5; i++){
            System.out.println(Thread.currentThread().getName() + " : " + i);
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
        }
    }

    static void main(String[] args) {
        Thread t1 = new Thread(new Myfile(), "Thread-1");
        Thread t2 = new Thread(new Myfile(), "Thread-2");

        t1.start();
        t2.start();
    }
}
