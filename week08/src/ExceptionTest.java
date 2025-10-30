import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;

        try{
            System.out.print("Input numerator : ");
            numerator = scanner.nextInt();
            System.out.print("Input denominator : ");
            denominator = scanner.nextInt();

            System.out.println(numerator/denominator);
        }catch (InputMismatchException err){
            System.out.println("숫자로 입력하세요.");
        }catch (ArithmeticException err){
            System.out.println("분모에 0이 올 수 없습니다!");
        }
    }
}
