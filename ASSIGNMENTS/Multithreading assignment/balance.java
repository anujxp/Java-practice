class Balance{
    private int balance = 1000;

    synchronized public void get(){
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(1000);
                balance -= 50;
                System.out.println(Thread.currentThread().getName() +"  - "+this.balance);
                
            }
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
class Collector extends Thread{
    Balance b1;
    public Collector(Balance b1 ){
        this.b1 = b1;
    }
    @Override
    public void run() {
       b1.get();
       

    }
}

class Main{
    public static void main(String[] args) {
        Balance b1 = new Balance();
        // Balance b2 = new Balance();

        Collector c1 = new Collector(b1);
        Collector c2 = new Collector(b1);

        c1.start();
        c2.start();



    }
}
