// Java program to demonstrate conversion integer and double to byte

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Declaring byte variable
        byte myByte;

        // Declaring and initializing integer and double variables
        int myInteger = 257;
        double myDouble = 321.141;
        long myLong = 11L;

        // Casting integer to byte: myInteger % 256
        myByte = (byte) myInteger;

        // Printing to console value myByte after casting
        System.out.println(myByte);

        // Casting double to byte: myDouble % 256
        myByte = (byte) myDouble;

        // Printing to console value myByte after casting
        System.out.println(myByte);

        // Casting long to byte: myLong is in range of byte 256
        myByte = (byte) myLong;

        // Printing to console value myByte after casting
        System.out.println(myByte);
    }
}