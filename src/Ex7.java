public class Ex7 {
    public static void main(String[] args) {
        System.out.println("Narcissistic numbers up to 1000:");
        getAllTheNarcissisticNumbers();
    }

    public static void getAllTheNarcissisticNumbers() {
        for (int i = 1; i <= 1000; i++) {
            if (isNarcissistic(i)) { // הפונקציה בודקת האם המספר נרקיסיסטי
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isNarcissistic(int number) {
        int digitsCount = countDigits(number); //  פונקציה שסופרת את כמות הספרות במספר
        int sum = 0;
        int tempNum = number;

        while (tempNum > 0) {
            int lastDigit = tempNum % 10;
            // חישוב כל אחת מהספרות בחזקת כמות הספרות והוספה לסכום
            sum += (int) Math.pow(lastDigit, digitsCount);
            tempNum /= 10;
        }
        //אם הסכום שווה למספר ההתחלתי מחזיר true אם לא מחזיר false
        return sum == number;
    }

    // פונקציה עזר  לספירת ספרות
    public static int countDigits(int number) {
        if (number == 0) return 1;
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}