package Practice;

class Producer1 extends Thread{

    Queuees q;

    public Producer1(Queuees q){
        this.q = q;
    }
    int i;
    public  void run(){
        while(true){
            q.produce(i++);

        }
    }
}
class Consumer1 extends Thread
{
    Queuees q;
    public Consumer1(Queuees q){
        this.q = q;
    }
    public void run() {
        while (true) {
            q.consumer();

        }
    }
}
class Queuees {
    int data;
    boolean flag = false;
    synchronized public void produce(int i) {
        try {
            if (flag) {
                System.out.println("producer in waiting state");
                wait();
            } else {
                data = i;
                System.out.println("this is the producer" + data);
                flag = true;
                notify();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    synchronized public void consumer(){
        try{
            if(!flag){
                System.out.println("consumer in wating State");
                wait();
            }else {
                System.out.println("i have consumed data" + data);
                flag = false;
                notify();
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
public class UsingthewaitandNotify {
    public static void main(String[] args) {
        Queuees q = new Queuees();
        new Producer(q).start();
        new Consumer(q).start();

    }
}
