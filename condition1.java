import java.util.Scanner;

public class condition1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int age = sc.nextInt();

            if (age > 18){
                System.out.println("he/she is adult");
            }
            else{
                System.out.println("he/she is under age");
            }
        }

    }
}
