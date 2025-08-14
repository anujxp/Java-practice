// 1. Write a Java program to create a class called "Person" with a name and age attribute. Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.

class Person{
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
        }

        public void setAge(int age) {
            this.age = age;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }
        public String getName() {
            return name;
        }
        public void display(){
            System.out.println(" person name is : "+ getName()+ " \n age id : " + getAge());
        }
}

class TestMain{
    public static void main(String args[]){
        Person p1 = new Person("Anuj", 19);
        Person p2 = new Person("SAtranga", 20);
        p1.display();
        p2.display();
        
    }
}