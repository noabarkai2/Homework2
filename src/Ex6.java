import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        displaysDiamondByNumberOfRows();
    }
    public static void displaysDiamondByNumberOfRows(){
        Scanner scanner = new Scanner(System.in);
        int number;
        int spaces;
        do {
            System.out.print("please enter an odd positive number greater than 3: ");
            number = scanner.nextInt();
        } while (number % 2 == 0 || number <= 3);
        //הדפסת החלק העליון
        for (int i = 1; i <= number; i+=2) {
            spaces = (number-i) / 2;
            for (int k = 0; k < spaces; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //חלק תחתון
        for (int i = number-2; i >= 1 ; i-=2) {
            spaces = (number-i) / 2;
            for (int k = 0; k < spaces; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
