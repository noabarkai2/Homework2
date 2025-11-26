import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter the first number in the arithmetic sequence : ");
        double a1 = scanner.nextDouble();
        System.out.print("please enter the difference between 2 consecutive terms in the arithmetic sequence : ");
        double d = scanner.nextDouble();
        int n;
        boolean nIsAbsorbed = false;
        do {
            if(!nIsAbsorbed){
                System.out.print("please enter a positive number of terms in the arithmetic sequence : ");
                nIsAbsorbed = true;
            }else{
                System.out.print("error: n have to be positive please enter again : ");
            }
            n = scanner.nextInt();
        }while(n <= 0);
        getArithmeticSequence(a1, d, n);
    }

    public static void getArithmeticSequence(double a1, double d, int n){
        int count = 0;
        double currentNumber = a1;
        while(count < n){
            if(count == n-1){
                System.out.print(currentNumber);
            }else{
                System.out.print(currentNumber + " , ");
            }
            currentNumber += d;
            count++;
        }

    }
}

