import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter a int number: ");
        int inputNumber = scanner.nextInt();
        boolean isInFibonacci = isNumberInFibonacciSeries(inputNumber);
        if(isInFibonacci){
            System.out.printf("The number %d IS in the fibonacci series", inputNumber);
        }else{
            System.out.printf("The number %d IS NOT in the fibonacci series", inputNumber);
        }
    }
    public static boolean isNumberInFibonacciSeries(int inputNumber){
        int num1 = 0;
        int num2 = 1;
        while(num1 < inputNumber){
            int nextTerm = num1 + num2;
            num1 = num2;
            num2 = nextTerm;
        }
        if(num1 == inputNumber){
            return true;
        }else{
            return false;
        }
    }
}
