class Animal{
    Animal(){
        System.out.println("Animal is created");
    }
}
class Dog extends Animal{
    Dog() {
        super(); //Call Parent constructor
        System.out.println("Dog is created");
    }
}
public class Const {
    public static void main(String[] args) {
        Dog myDog = new Dog();
    }
    
}

