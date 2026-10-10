import java.util.Scanner;
class Animal {
    void sound(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Bark");
    }
}
public class hello{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}