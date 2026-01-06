class T{
    public T(int x){
        System.out.println("paret class");
    }
}
class child extends T{
    public child(){
        super(5);
        this();
        System.out.println("child");
    }

}
class Main{
    public static void main(String[] args) {
        child c1 = new child();

    }
}