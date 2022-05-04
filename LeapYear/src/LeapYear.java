import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*System.out.print("Please Enter Year...:");
        int year = scanner.nextInt();*/

        int[] array = {1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024, 1200, 1600, 2000, 1200, 1600, 2000, 1700, 1800, 1900};

        for (int i = 0; i < array.length; i++) {
           if (array[i] % 4 == 0 && array[i] % 400 != 0 && (array[i]  % 100 != 0)) {
                System.out.println(array[i] + " is leap year");
            } else if (array[i] % 400 == 0 && array[i] % 4 == 0) {
                System.out.println(array[i] + " is leap year.");
            } else {
                System.out.println(array[i] + " is not leap year.");
            }
        }
    }
}
