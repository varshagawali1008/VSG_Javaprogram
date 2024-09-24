public class Tc5{
    public static void main(String[] args) {
        long largeNum = 128L;
        byte smallNum = (byte) largeNum;  // Explicit casting from long to byte (overflow occurs)
        
        System.out.println("Explicit Casting (long to byte with overflow):");
        System.out.println("Long value: " + largeNum);
        System.out.println("Byte value (after casting): " + smallNum);  // Overflow, value wrapped around
    }
}

