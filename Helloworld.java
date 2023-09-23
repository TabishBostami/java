import java.util.Scanner;

class Helloworld{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String c =sc.nextLine();
            System.out.println(c);
        }
    }
}