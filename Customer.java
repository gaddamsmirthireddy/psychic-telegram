class Bus implements Runnable{
    int available=1,passenger;
    Bus(int passenger){
        this.passenger=passenger;
    }
    public synchronized void run(){
        String name =Thread.currentThread().getName();
        if(available>=passenger){
            System.out.println(name+"reserved");
            available=available-passenger;
        } else{
            System.out.println("Not reserved");
        }
    }
}
public class Customer {
    public static void main(String[] args){
        Bus r = new Bus(1);
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);
        t1.setName("Ram");
        t2.setName("Raju");
        t3.setName("Ravi");
        t1.start();
        t2.start();
        t3.start();
    }
}