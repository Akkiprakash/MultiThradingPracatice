package Practice;


import java.util.Scanner;
/*

After the execution of the main thread only the remaing threds were executed
we can stop teh tread using the join

using synchronization we can go with the thread
 */
class Alpha3 implements Runnable{
    public void run(){
        String thread = Thread.currentThread().getName();
        if(thread.equals("Bank")){
            bank();
        }
        else if(thread.equals("printing")){
            try{
                printing();
            }
            catch (InterruptedException e) {
                e.getStackTrace();
            }
        }
        else{
            motvive();
        }
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
    public void printing() throws InterruptedException{
        System.out.println("printing started");
        for(int i=0;i<3;i++){
            System.out.println("*******");
            Thread.sleep(2000);
        }
        System.out.println("printing Terminated");

    }
    public void motvive(){
        System.out.println("motive started");
        for(int i=0;i<3;i++){
            System.out.println("Focus is the key");
        }
        System.out.println("motive Terminated");
    }
}
public class Using1RunMethod {
    public static void main(String[] args)  {
        Alpha3 a = new Alpha3();
        System.out.println("application Starts");
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(a);
        Thread t3 = new Thread(a);
         t1.setName("Bank");
         t2.setName("printing");
         t3.setName("motvie");
         t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t3.start();
        try {
            t3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();
        System.out.println("terminated");
    }

}
