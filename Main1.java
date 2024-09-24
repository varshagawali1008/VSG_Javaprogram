interface GenericInterface<T> {
    void display(T value);
}

class GenericClass implements GenericInterface<String> {
    public void display(String value) {
        System.out.println("Value: " + value);
    }
}

public class Main1 {
    public static void main(String[] args) {
        GenericClass obj = new GenericClass();
        obj.display("Hello Generics");
    }
}
