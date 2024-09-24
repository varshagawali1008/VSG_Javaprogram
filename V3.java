class Person {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Person p = new Person(); // instance variables have default values (null, 0)
        p.display();
    }
}

