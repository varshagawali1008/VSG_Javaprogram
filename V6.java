class Employee {
    static String companyName = "TechCorp"; // static variable
    String employeeName;

    Employee(String name) {
        employeeName = name;
    }

    void display() {
        System.out.println(employeeName + " works at " + companyName);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Alice");
        Employee e2 = new Employee("Bob");
        e1.display();
        e2.display();
    }
}

