package Practice;

import java.util.Scanner;


/*
-> the thread exectuion is not in the hand of us
-> it wille xecutes the random by the threadScehdular
-> if the trhead stop atleat 1 sec the anothier thread going to executes till the threas wake up
 */
class Alpha1 extends Thread{

    public void run(){
        bank();
    }
    public void bank(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enetr the bank deatils");
        try{
            Thread.sleep(2000);
        }
        catch (InterruptedException e){
            e.getStackTrace();
        }

        System.out.println("enter the userid");
        int a = sc.nextInt();
        System.out.println("Enter password");
        int pass = sc.nextInt();
        System.out.println("clicl to withdraw");
    }
}
class Beta1 extends Thread{
    public void run(){
        try{
            printing();
        }
        catch (Exception e){
            return;
        }
    }
    public void printing() throws InterruptedException{
        System.out.println("printing started");
        for(int i=0;i<3;i++){
            System.out.println("*******");
            Thread.sleep(2000);
        }
        System.out.println("printing Terminated");

    }
}
class Gama1 extends Thread{
    public  void run(){
        motvive();
    }
    public void motvive(){
        System.out.println("motive started");
        for(int i=0;i<3;i++){
            System.out.println("Focus is the key");
        }
        System.out.println("motive Terminated");
    }
}
public class UsingExtends {
    public static void main(String[] args) {
        Alpha1 a= new Alpha1();
        Beta1 b = new Beta1();
        Gama1 c = new Gama1();
        a.start();
        b.start();
        c.start();
    }
}
