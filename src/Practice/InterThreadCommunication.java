package Practice;

class Producer extends Thread{

    Queuees q;

    public Producer(Queuees q){
        this.q = q;
    }
    int i;
    public  void run(){
        while(true){
           q.produce(i++);

        }
    }
}
class Consumer extends Thread
{
    Queuees q;
    public Consumer(Queuees q){
        this.q = q;
    }
    public void run() {
        while (true) {
            q.consumer();

        }
    }
}
class Queue{
    int data;
    public void produce(int i) {
        data = i;
        System.out.println("this is the producer" + data);
    }
    public void consumer(){
        System.out.println("i have consumed data" + data);
    }
}

public class InterThreadCommunication {
    public static void main(String[] args) {
        Queuees q = new Queuees();

        ///  here we are using the single using of the object so we can also e=write using the annonymious object

        new Producer(q).start();
        new Consumer(q).start();
//        Producer produce = new Producer(q);
//        Consumer consumer = new Consumer(q);
        // starting the thread giving live
//        produce.start();
//        consumer.start();
    }
}
