import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j;
        do{ 
            int marks = sc.nextInt();
            if(marks>=90 && marks<=100){
                System.out.println("this is good");
            }
            else if(marks>=60 && marks<=89){
                System.out.println("this is also good");
            }
            else if(marks>=0 && marks<=59){
                System.out.println("this is also good as well");
            }
            else{
                System.out.println("invalid");
            }
            System.out.println("if you want to continue press 1 or want close press 0");
            j=sc.nextInt();

        }while(j==1);
        sc.close();
        System.out.println("thank you ,good bye!");
    }
    
}
