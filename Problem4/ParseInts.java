package JavaQAP4.Problem4;

// ****************************************************************
// ParseInts.java //
// Reads a line of text and prints the integers in the line.
//
// ****************************************************************
import java.util.Scanner;

public class ParseInts {
    public static void main(String[] args) {
        int val, sum = 0;
        Scanner scan = new Scanner(System.in);
        String line;

        System.out.println("Enter a line of text");
        Scanner scanLine = new Scanner(scan.nextLine());

        // try statement inside the while loop so it will handle non-integer tokens
        while (scanLine.hasNext()) {
            try {
                val = Integer.parseInt(scanLine.next());
                sum += val;
            } catch (NumberFormatException e) { // catch the exception
                // do nothing
                
            }
        }

        System.out.println("The sum of the integers on this line is " + sum);
    }
}

