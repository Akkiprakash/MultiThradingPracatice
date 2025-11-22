package Practice;

import java.util.Scanner;

class Alpha{
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
class Beta{
    public void printing() throws InterruptedException{
        System.out.println("printing started");
        for(int i=0;i<3;i++){
            System.out.println("*******");
            Thread.sleep(2000);
        }
        System.out.println("printing Terminated");

    }
}
class Gama{
    public void motvive(){
        System.out.println("motive started");
        for(int i=0;i<3;i++){
            System.out.println("Focus is the key");
        }
        System.out.println("motive Terminated");
    }
}
public class DifferentClasse {
    public static void main(String[] args) {
        Alpha a = new Alpha();
        Beta b = new Beta();
        Gama c = new Gama();
        a.bank();
        try {
            b.printing();
        }
        catch (InterruptedException e){
            System.out.println(e);
        }

        c.motvive();
    }


}
