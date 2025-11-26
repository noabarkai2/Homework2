import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter a int number: ");
        int number = scanner.nextInt();
        int sum = calculateSumOfDigitsOfNumber(number);
        System.out.printf("The sum of digits in %d is: %d", number, sum);


    }
    public static int calculateSumOfDigitsOfNumber(int number){
        int currentDigit = 0;
        int sum = 0;
        while(number>0){ //כל פעם סוכם את ספרת האחדות ומחלק בעשר את המספר עד שמגיע ל-0.
            currentDigit = number % 10;
            sum += currentDigit;
            number/= 10;
        }
        return sum;
    }
}
