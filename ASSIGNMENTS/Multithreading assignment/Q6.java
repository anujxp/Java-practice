class Task {
   private static int count = 0;
    synchronized static public void m1() {
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
    synchronized static public void m2() {
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
    synchronized public void m3() {
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
    synchronized public void m4() {
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

class T1 extends Thread{
    private Task t1;
    public T1(Task t1){
        this.t1 = t1;
    }
    @Override
    public void run() {
       this.t1.m1();
    }
}
class T2 extends Thread{
    private Task t1;
    public T2(Task t1){
        this.t1 = t1;
    }
    @Override
    public void run() {
       this.t1.m2();
    }
}
class T3 extends Thread{
    private Task t1;
    public T3(Task t1){
        this.t1 = t1;
    }
    @Override
    public void run() {
       this.t1.m3();
    }
}
class T4 extends Thread{
    private Task t1;
    public T4(Task t1){
        this.t1 = t1;
    }
    @Override
    public void run() {
       this.t1.m4();
    }
}

class Test {
    public static void main(String[] args) {
        Task task1 = new Task();
        T1 t1 = new T1(task1);
        T2 t2 = new T2(task1);
        T3 t3 = new T3(task1);
        T4 t4 = new T4(task1);
        t4.start();
        t2.start();
        t3.start();
        t1.start();
    }
}