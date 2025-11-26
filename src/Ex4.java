import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter a amount of prime numbers: ");
        int amountOfPrimeNumbers = scanner.nextInt();
        int currentNumber = 2;// מתחילים מ-2 כי הוא המספר הראשוני הראשון
        int count = 0;
        System.out.printf("The first %d prime numbers are: ", amountOfPrimeNumbers);
        while (count < amountOfPrimeNumbers) {
            if(isPrime(currentNumber)){// מפעיל את הפונקציה isPrime ובודק מספר מהמספר הראשוני הראשון (שהוא 2)
                // והלאה אם המספר ראשוני עד שמגיע לamount של המספרים הראשוניים שקיבלתי בקלט
                if(count < amountOfPrimeNumbers-1) { //בשביל לעשות פסיקים בהכל חוץ מבאחרון
                    System.out.print(currentNumber + ", ");
                }else{
                    System.out.print(currentNumber);
                }
                count++;
            }
            currentNumber++;
        }

    }
    public static boolean isPrime(int number) {
        if(number<2) return false;
        for (int i = 2; i < number ; i++) //מספר ראשןני מתחלק באחד ובעצמו
            // לכן מאתחלים את i = 2 והתנאי i<number לא כולל number
            // כי לא רוצים לבדוק אם מתחלק בעצמו אני בחרתי לבדוק אם הוא לא ראשוני ואז אחרת  הוא ראשוני.
        {
            if(number % i == 0){
                return false; // יש מחלק שלא אחד ולא עצמו לכן לא ראשוני
            }
        }
        return true;
    }
}
