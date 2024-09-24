class DisplayNumbers {
    void showOdd() {
        int number = 1; // local variable
        System.out.println("Odd Number: " + number);
    }

    void showEven() {
        int number = 2; // local variable
        System.out.println("Even Number: " + number);
    }

    public static void main(String[] args) {
        DisplayNumbers obj = new DisplayNumbers();
        obj.showOdd();
        obj.showEven();
    }
}

