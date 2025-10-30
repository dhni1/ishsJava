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
            //double denominator = scanner.nextDouble();
            denominator = scanner.nextInt();
        }catch (InputMismatchException err){
            System.out.println("숫자로 입력하세요.");
        }

        if(denominator == 0){
            System.out.println("분모에 0이 올 수 없습니다!");  // logical error
        }else{
            System.out.println(numerator/denominator);
        }
    }
}
