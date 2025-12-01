package Practice;

import java.util.Scanner;

/*
 Its is the single thrading which depends in the main thread
 -> main thread is the deault thread
 -> for its boss is the ThreadSchedular
 */
public class MulticheckingDefault {
    public static void main(String[] args) throws InterruptedException{
        //task 1 Bank
        Scanner sc = new Scanner(System.in);
        System.out.println("enetr the bank deatils");
        Thread.sleep(2000);
        System.out.println("enter the userid");
        int a = sc.nextInt();
        System.out.println("Enter password");
        int pass = sc.nextInt();
        System.out.println("clicl to withdraw");

        //task -2
        System.out.println("printing started");
        for(int i=0;i<3;i++){
            System.out.println("*******");
            Thread.sleep(2000);
        }
        System.out.println("printing Terminated");

        // task 3
        System.out.println("motive started");
        for(int i=0;i<3;i++){
            System.out.println("Focus is the key");
        }
        System.out.println("motive Terminated");

    }
}
