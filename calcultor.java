import java.util.Scanner;

public class calcultor {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of a and b for calculation");
        int a = sc.nextInt();
        int b = sc.nextInt();

        sc.nextLine();
        System.out.print("enter your operation operator");
        String c =sc.nextLine();    

        switch(c){
            case "+" :
            int d = a+b;
            System.out.println(d);
            break;

            case "-":
            d= a-b;
            System.out.println(d);
            break;

            case "*":
            d =a*b;
            System.out.println(d);
            break;

            case "/":
            d = a/b;
            System.out.println(d);
            break;

            case "%":
            d= a%b;
            System.out.println(d);
            break;

        
        }
sc.close();


    } 
}
