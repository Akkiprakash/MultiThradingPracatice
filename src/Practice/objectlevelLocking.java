package Practice;

class Example {
    public synchronized void objectLock() {
        System.out.println(Thread.currentThread().getName() + " entered object lock");
        try { Thread.sleep(5000); } catch(Exception e){}
        System.out.println(Thread.currentThread().getName() + " exited");
    }
}
public class objectlevelLocking {
    public static void main(String[] args) {
        Example obj1 = new Example();
        Example obj2 = new Example(); // separate object → separate lock

        Thread t1 = new Thread(() -> obj1.objectLock(), "Thread-1");
        Thread t2 = new Thread(() -> obj1.objectLock(), "Thread-2"); // same object
        Thread t3 = new Thread(() -> obj2.objectLock(), "Thread-3"); // different object

        t1.start();
        t2.start();
        t3.start();
    }
}
