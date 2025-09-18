class Task {
    private int count = 0;
    private int counter = 0;
    synchronized public void m1() {
        try {
            for (int index = 0; index < 5; index++) {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(1000);
                System.out.println("count " + this.count++);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    synchronized public void m2() {
        try {
            for (int index = 0; index < 5; index++) {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(1000);
                this.count--;
                System.out.println("count"+this.count);
            }
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
     public void m3() {
        try {
            for (int index = 0; index < 5; index++) {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(1000);
                System.out.println("counter" + this.counter++);
                System.out.println();
                System.out.println();
            }
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}

class Mythread extends Thread {
    private Task obj1;

    public Mythread(Task obj) {
        this.obj1 = obj;
    }

    @Override
    public void run() {
        this.obj1.m1();

    }
}

class Mythread1 extends Thread {
    private Task obj1;

    public Mythread1(Task obj) {
        this.obj1 = obj;
    }

    @Override
    public void run() {
        this.obj1.m2();
        
    }
}
class Mythread2 extends Thread {
    private Task obj1;

    public Mythread2(Task obj) {
        this.obj1 = obj;
    }

    @Override
    public void run() {
        this.obj1.m3();
        
    }
}

class Test {

    public static void main(String[] args) {
        Task t1 = new Task();
        Mythread m1 = new Mythread(t1);
        Mythread1 m2 = new Mythread1(t1);
        Mythread2 m3 = new Mythread2(t1);
        m1.start();
        m2.start();
        m3.start();

    }

}
