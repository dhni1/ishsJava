import java.util.Scanner;

public class PrimeGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        int number = sc.nextInt();

        for(int i = 1; i <= number; i=i+1){
            if(number % i == 0){
                counter++; //counter = counter + 1
            }
        }
        if(counter == 2){
            System.out.println(number + " is a Prime Number~");
        }else{
            System.out.println(number + " is NOT Prime Number!");
        }
    }
}
