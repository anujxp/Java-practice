class Task {
    private int count = 0;

    synchronized public void m1() {
        try {
            System.out.println(Thread.currentThread().getName());
            for (int index = 0; index < 5; index++) {
                Thread.sleep(1000);
                System.out.println(this.count++);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    synchronized public void m2() {
        try {
            System.out.println(Thread.currentThread().getName());
            for (int index = 0; index < 5; index++) {
                Thread.sleep(1000);
                this.count--;
                System.out.println(this.count);
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

class Test {

    public static void main(String[] args) {
        Task t1 = new Task();
        Mythread m1 = new Mythread(t1);
        Mythread1 m2 = new Mythread1(t1);
        m1.start();
        m2.start();
    }

}