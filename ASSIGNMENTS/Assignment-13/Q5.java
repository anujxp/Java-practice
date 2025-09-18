class Task {
   private static int count = 0;

    synchronized public static void m1() {
        try {
            for (int index = 0; index < 5; index++) {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName());
                System.out.println(count++);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

class Th extends Thread {
    private Task t1;
    Th(Task t1){
        this.t1 = t1;
    }
    @Override
    public void run() {
       this.t1.m1();
    }

}

class Test {
    public static void main(String[] args) {
        Task t1 = new Task();
        Task t2 = new Task();
        Th th = new Th(t1);
        Th th2 = new Th(t2);
        th.start();
        th2.start();


      
    }
}