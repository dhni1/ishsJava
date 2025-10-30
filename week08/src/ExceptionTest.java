import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input numerator : ");
        double numerator = scanner.nextInt();
        System.out.print("Input denominator : ");
        double denominator = scanner.nextInt();

        System.out.println(numerator/denominator);
    }
}
