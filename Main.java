import java.util.Scanner;

public class Main{

    public static void main (String args[]) {
        int n; int num = 0;
        Scanner in = new Scanner(System.in);
        Array arr = new Array();

        while (num != 9) {
            System.out.println("Enter operation number >");
            System.out.println("0. (Enter/Change) the size of the array");
            System.out.println("1. Random input of array numbers");
            System.out.println("2. Manual entry of array numbers");
            System.out.println("3. Determine the number of array elements" +
                    "for which the digital root is less than the specified value.");
            System.out.println("4. Form an array of friendly numbers from the original array.");
            System.out.println("5. Exit");
                num = in.nextInt();
                switch (num) {
                    case 0:
                        arr.Array();
                        break;
                    case 1:
                        arr.randInput(0, 100);
                        break;
                    case 2:
                        arr.ArrayInput();
                        break;
                    case 3:
                        arr.DigitRoot();
                        break;
                    case 4:
                        arr.Friends();
                        break;
                    case 5:
                        return;
                    default:
                        System.out.println("You enter uncorrect number");
                }
        }
    }
}