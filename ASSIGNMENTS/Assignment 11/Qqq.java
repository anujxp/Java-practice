interface I{
    void wish();
    default void greet(){
        System.out.println("greeting...");
    }
}
class Main{
    public static void main(String[] args) {
        I obj = ()-> System.out.println("wish");
        obj.greet();
    }
}