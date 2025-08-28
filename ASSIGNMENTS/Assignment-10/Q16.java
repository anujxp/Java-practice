class Person {
    private String name;
    private int age;

    public Person() {
        this.age = 18;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Default Name"; 
        p1.display();

        Person p2 = new Person("Alice", 25);
        p2.display();
    }
}
