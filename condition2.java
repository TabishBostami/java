import java.util.Scanner;

public class condition2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a==b){
            System.out.println("a and b are equal");
        }
       else if(a<b){
        System.out.println("a is less than b");
       }
       else{
        System.out.println("b is less than a");
       }
       sc.close();
        }   
    }

