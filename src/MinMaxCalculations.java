import java.util.Scanner;

public class MinMaxCalculations {
    public static void main(String[] args) {
        int min, max;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter 1st Value: ");
        int val = s.nextInt();


        min = max = val;
        while (val != 0) {
            System.out.print("Enter 2nd Value: ");
            val = s.nextInt();

            if (val != 0) {
                if (val < min) {
                    min = val;
                }
                if (val > max) {
                    max = val;
                }
            }
        }
        
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
