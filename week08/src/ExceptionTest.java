import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input numerator : ");
        int numerator = scanner.nextInt();
        System.out.print("Input denominator : ");
        int denominator = scanner.nextInt();

        if(denominator == 0){
            System.out.println("분모가 0이 될 수 없습니다.");
        }{
            System.out.println(numerator/denominator);
        }

        System.out.println(numerator/denominator);
    }
}
