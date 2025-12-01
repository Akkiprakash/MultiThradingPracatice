package Practice;


import java.util.Scanner;


/*
Usign the ruannble it is long process of code but the thread safe
-> used in the stringBuffer
-> if we want to stop the thread we can use the a.join() Keyword
--> extra we have the constructor with the thread using the refrence of the objec
 */
class Alpha2 implements Runnable {

    public void run() {
        bank();
    }

    public void bank() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enetr the bank deatils");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.getStackTrace();
        }

        System.out.println("enter the userid");
        int a = sc.nextInt();
        System.out.println("Enter password");
        int pass = sc.nextInt();
        System.out.println("clicl to withdraw");
    }
}

class Beta2 implements Runnable {
    public void run() {
        try {
            printing();
        } catch (Exception e) {
            return;
        }
    }

    public void printing() throws InterruptedException {
        System.out.println("printing started");
        for (int i = 0; i < 3; i++) {
            System.out.println("*******");
            Thread.sleep(2000);
        }
        System.out.println("printing Terminated");

    }
}

class Gama2 implements Runnable {
    public void run() {
        motvive();
    }

    public void motvive() {
        System.out.println("motive started");
        for (int i = 0; i < 3; i++) {
            System.out.println("Focus is the key");
        }
        System.out.println("motive Terminated");
    }
}

public class UsingRunnable {
    public static void main(String[] args) {
        ///  creating the three object
        Alpha2 a = new Alpha2();
        Beta2 b = new Beta2();
        Gama2 c = new Gama2();

        ///  creating the threads for each
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        Thread t3 = new Thread(c);

        t1.start();
        t2.start();
        t3.start();
    }
}
