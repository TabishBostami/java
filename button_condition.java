import java.util.Scanner;

public class button_condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("choose button for greet 1,2,31");
        int a = sc.nextInt();
       

        if (a==1)
        {
        System.out.println("hello");
        }
       else if(a==2)
       {
        System.out.println("Namaste");
       }
       else if(a==3)
       {
        System.out.println("Bonjour");
       }
       else
       {
        System.out.println("Invalid input");
       }
       sc.close();
        }   
    }
