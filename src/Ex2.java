import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter the first number in the arithmetic sequence : ");
        double a1 = scanner.nextDouble();
        System.out.print("please enter the difference between 2 consecutive terms in the arithmetic sequence : ");
        double d = scanner.nextDouble();
        int n;
        //  בודקת אם המספר חיובי או לא אם לא מבקשת שוב מהמשתמש ומציגה לו הודעת error
        do {
            System.out.print("Please enter a positive number of terms in the arithmetic sequence: ");
            n = scanner.nextInt();

            if (n <= 0) {
                // הודעת שגיאה מודפסת רק אם התנאי נכשל
                System.out.println("Error: The number of terms (n) must be positive. Please try again.");
            }
        } while (n <= 0);
        getArithmeticSequence(a1, d, n);
    }

    public static void getArithmeticSequence(double a1, double d, int n){
        int count = 0;
        for (int i = 0; i < n; i++) {
            // הנוסחה לאיבר נוכחי - a_i = a1 + (i * d)
            double currentTerm = a1 + (i * d);

            //  אם זה האיבר האחרון מדפיס בלי פסיק
            if (i == n - 1) {
                System.out.print(currentTerm);
            } else {
                System.out.print(currentTerm + ", ");
            }
        }

    }
}

