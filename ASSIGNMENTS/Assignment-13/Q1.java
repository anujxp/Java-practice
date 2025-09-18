class Task {
    synchronized public void m1() {
        for (int index = 0; index < 10; index++) {
            try {
                Thread.sleep(1200);
                System.out.println("task 1 ");
                System.out.println(Thread.currentThread().getName());
            } catch (Exception e) {
                e.printStackTrace();
            }
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
        Th t2 = new Th(t1);
        t2.setName("Thread : t1");

        Th t3 = new Th(t1);
         t3.setName("Thread : t2");
         t2.start();
         t3.start();
    }
}