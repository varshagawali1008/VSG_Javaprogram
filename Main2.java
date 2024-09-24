interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Bark");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sound();
    }
}
