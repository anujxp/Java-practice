// 2. Write a Java program to create a class called "Dog" with a name and breed attribute. Create two instances of the "Dog" class, set their attributes using the constructor and modify the attributes using the setter methods and print the updated values.

class Dog{
    private String name;
    private String Breed;

    public Dog(String name, String Breed){
        this.name = name;
        this.Breed = Breed;
        }

        public void setBreed(String Breed) {
            this.Breed = Breed;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getBreed() {
            return Breed;
        }
        public String getName() {
            return name;
        }
        public void display(){
            System.out.println(" person name is : "+ getName()+ " \n Breed id : " + getBreed());
        }
}

class TestMain{
    public static void main(String args[]){
        Dog p1 = new Dog("oreo","jermanspert" );
        p1.display();
        p1.setName("sheeru");
        p1.display();
        
        
    }
}