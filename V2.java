class Dog {
    String breed;
    String color;

    Dog(String b, String c) {
        breed = b;
        color = c;
    }

    void showDetails() {
        System.out.println("Breed: " + breed + ", Color: " + color);
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Labrador", "Black");
        Dog dog2 = new Dog("Poodle", "White");

        dog1.showDetails();
        dog2.showDetails();
    }
}

