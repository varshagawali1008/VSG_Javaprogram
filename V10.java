class Circle {
    void calculateArea() {
        double radius = 5.0; // local variable
        double area = 3.14 * radius * radius;
        System.out.println("Area: " + area);
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.calculateArea();
    }
}

