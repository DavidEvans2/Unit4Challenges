import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Why don't ya try entering a number?");
        long number = keyboard.nextLong();
        int smallNumber;
        short smallerNumber;
        byte smallestNumber;

        if (number > Byte.MAX_VALUE || number < Byte.MIN_VALUE)
        {
            if (number > Short.MAX_VALUE || number < Short.MIN_VALUE)
            {
                if (number > Integer.MAX_VALUE || number < Integer.MIN_VALUE)
                {
                    System.out.println("This number can't be any smaller, it's a Long.");
                } else {
                    smallNumber = (int)number;
                    System.out.println(smallNumber + " is an Integer.");
                }
            } else {
                smallerNumber = (short)number;
                System.out.println(smallerNumber + " is a Short.");
            }
        } else {
            smallestNumber = (byte)number;
            System.out.println(smallestNumber + " is a Byte.");
        }
    }
}