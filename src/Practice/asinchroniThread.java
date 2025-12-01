package Practice;

/*
confusing which ever get executed
--> cpu time cycle is not wasted
--> but messy in the output
--> Synchromisation is which the Only giving the acces to the one thread wheter 1 2 3 any
 --> we can also usid in the inside the block also

 */
class Mycar implements Runnable{
      public void run(){
        try{
            System.out.println(Thread.currentThread().getName() + "enterd parking lot");
            Thread.sleep(3000);
            synchronized (this) { //because it calls the same class means here the currrent Thread Only
                System.out.println(Thread.currentThread().getName() + "enterd driving");
            Thread.sleep(3000);
                System.out.println(Thread.currentThread().getName() + " Driving the car");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + "enter to home");
            }
        }
        catch (InterruptedException e){
            e.getStackTrace();
        }
    }
}
public class asinchroniThread {
    public static void main(String[] args) {
        Mycar car = new Mycar();

        Thread t1 = new Thread(car);
        Thread t2 = new Thread(car);
        Thread t3 = new Thread(car);
        t1.setName("banti");
        t3.setName("akki");
        t2.setName("ramesh");
        t1.start();
        t2.start();
        t3.start();


    }
}
