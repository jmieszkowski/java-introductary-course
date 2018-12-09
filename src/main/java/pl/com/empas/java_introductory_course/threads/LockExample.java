package pl.com.empas.java_introductory_course.threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {

    public static void main(String[] args) {
        Lock myLock = new ReentrantLock();
        myLock.lock();

        myLock.tryLock();
    }
}
