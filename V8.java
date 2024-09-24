class LoopExample {
    void printNumbers() {
        for (int i = 1; i <= 5; i++) { // local variable in loop
            System.out.println("Number: " + i);
        }
    }

    public static void main(String[] args) {
        LoopExample obj = new LoopExample();
        obj.printNumbers();
    }
}

