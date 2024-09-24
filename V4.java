class Student {
    private String name;
    private int rollNo;

    public void setName(String n) {
        name = n;
    }

    public void setRollNo(int r) {
        rollNo = r;
    }

    public void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.setName("John");
        s.setRollNo(101);
        s.display();
    }
}

