import java.util.Scanner;

public class NestedSwitch1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println(num + " is positive.");
        } else if (num == 0) {
            System.out.println("The number is zero.");
        } else {
            System.out.println(num + " is negative.");
        }
    }
}

