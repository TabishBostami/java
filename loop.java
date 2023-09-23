import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        int sum =0;
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            for(int i=0;i<n+1;++i)
            {
                
                sum = sum + i;
                
            
            }
            
        }
        System.out.println("total sum = "+ sum);
        
    }
    
}
