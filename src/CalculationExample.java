import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input x: ");
        int x = scanner.nextInt();
        System.out.println("Input y: ");
        int y = scanner.nextInt();
        CalculationExample calculationExample = new CalculationExample();
        calculationExample.calculate(x,y);

    }
    private void calculate(int x, int y) {
        try {
            int a = x+ y;
            int b = x-y;
            int c = x*y;
            int d = x/y;
            System.out.println("Total of x and y: " + a);
            System.out.println("Sub of x and y: " + b);
            System.out.println("Multiplication of x and y: " + c);
            System.out.println("Division of x and y: " + d);
        } catch (Exception e) {
            System.err.println("Exception has occurred: " + e.getMessage());
        }
    }
}
