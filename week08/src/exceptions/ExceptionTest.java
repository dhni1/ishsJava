package exceptions;

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
            int[] array = {99, -7, 33};
            System.out.println(array[1]);
            //System.out.println(array[3]);
        }catch (InputMismatchException err) {
            System.out.println("숫자로 입력하세요.");
            System.out.println(err.getMessage());
        }catch (ArithmeticException err){
            System.out.println("분모에 0이 올 수 없습니다!");
            System.out.println(err.getMessage());
        }catch (ArrayIndexOutOfBoundsException err){
            System.out.println("인덱스의 범위를 벗어났습니다");
            System.out.println(err.getMessage());
        }catch (Exception err){  // 위에서 해결할 수 없는 예외처리
            System.out.println("에러 발생");
            System.out.println(err.getMessage());
        }finally {  // 예외 발생 여부에 상관 없이 항상 실행
            System.out.println("프로그램을 종료합니다");
            // 자원 해제등의 필요할 때 사용
        }
    }
}
