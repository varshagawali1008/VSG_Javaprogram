class Car {
    String model; // instance variable
    int speed;    // instance variable

    Car(String m, int s) {
        model = m;
        speed = s;
    }

    void display() {
        System.out.println("Model: " + model + ", Speed: " + speed);
    }

    public static void main(String[] args) {
        Car car1 = new Car("BMW", 200);
        car1.display();
    }
}

