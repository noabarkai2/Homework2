import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("please enter an odd positive number greater than 3: ");
            number = scanner.nextInt();
        } while (number % 2 == 0 || number <= 3);
        int mid = number/ 2; //מחלק את היהלוום ל-2 בשורות כך שמשולש אחד גדול מה-2 בשורה האחת שזה האמצע
        //הדפסת החלק העליון
        int spacesNeeded;
        int lineLength;
        for (int i = 0; i <= mid; i++) {
             spacesNeeded = mid-i;
            lineLength = number-spacesNeeded;
            for (int j = 0; j < lineLength; j++) {
                if(j<spacesNeeded){
                    System.out.print(" ");

                    }  else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        //חלק תחתון
        for (int i = 1; i <= mid  ; i++) {////מתרחקים מהמרכז לכן מספר הרווחים גדל שוב
            spacesNeeded = i;
            lineLength = number - spacesNeeded;

            for (int j = 0; j < lineLength ; j++) {
                if(j<spacesNeeded){
                    System.out.print(" ");
                }else{
                    System.out.print("*");

                }
            }
            System.out.println();
        }
    }
}
