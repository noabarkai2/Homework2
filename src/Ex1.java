import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter a: ");
        double a = scanner.nextDouble();
        System.out.print("please enter b: ");
        double b = scanner.nextDouble();
        System.out.print("please enter c: ");
        double c = scanner.nextDouble();
        if(a == 0){
            System.out.println("Error: a cannot be 0 in quadratic equation.");
        }else{
        solveQuadratic(a, b, c);
        }


    }
    public static void solveQuadratic(double a, double b, double c){

        double discriminant = b * b - 4 * a * c;
        if(discriminant > 0){
            double x1 = (-b + Math.sqrt(discriminant))/ (2 * a);
            double x2 = (-b - Math.sqrt(discriminant))/ (2 * a);
            System.out.println("The equation has 2 solutions: x1 = " + x1 + ", x2 = " + x2);
        }else if(discriminant == 0){
            double x = -b / (2 * a);
            System.out.println("The equation has one solution: x = " + x);
        }else{
            System.out.println("The equation has no real solution.");
        }
    }
}
