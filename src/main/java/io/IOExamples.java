package io;

import java.net.MalformedURLException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class IOExamples {
    static int board1;
    static int board2;

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        Lock pen2 = new ReentrantLock();
//        List<BoardWriter> boardWriters = new LinkedList<>();
        Lock pen1 = new ReentrantLock();
//        for (int i = 0; i < 1000; i++) {
            BoardWriter t1 = new BoardWriter(pen1,pen2);
//            boardWriters.add(t1);
            t1.start();
//        }

        Thread.currentThread().sleep(10000);
        System.out.println(board1);
        System.out.println(board2);
//        BoardWriter t2 = new BoardWriter(pen);
//        t2.start();
        Thread.currentThread().sleep(10000);
//        t1.stopThread();
//        t2.stopThread();
//        t1.stop();
//        t2.stop();
    }

    static class BoardWriter extends Thread {

        private final Lock pen1;
        private Lock pen2;
        private boolean isDone;

        BoardWriter(Lock pen1, Lock pen2) {
            this.pen1 = pen1;
            this.pen2 = pen2;
        }

        public void a(){
            writeOnBoared2();
            writeOnBoared1();
        }

        public void b(){
            c();
            b();
        }

        public void c(){
            writeOnBoared1();
            writeOnBoared2();
        }
        @Override
        public void run() {
//            isDone = false;
//            while (!isDone) {
            System.out.println("updating the board  tid = " + Thread.currentThread().getId());
            try {
                Thread.currentThread().sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            writeOnBoared1();
            writeOnBoared2();
//            lock.lock();
//            board++;
//            lock.unlock();
//                System.out.println("finished updating the board tid = " + Thread.currentThread().getId());
//            }
        }


        public void writeOnBoared1(){
            pen1.lock();
            board1++;
            pen1.unlock();
            writeOnBoared2();
        }


        public void writeOnBoared2(){
            pen2.lock();
            board2++;
            pen2.unlock();
            writeOnBoared1();
        }

        public void stopThread() {
            isDone = true;
        }
    }


}
