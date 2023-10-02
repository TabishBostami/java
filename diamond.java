public class diamond {
    public static void main(String[] args) {
        int n = 5;
        for(int j=1;j<=n;j++){
            for(int i=0;i<n-j;i++){
                System.out.print("  ");
            }         
            for(int l=1;l<=2*j-1;l++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        for(int j=n;j>=1;j--){
            for(int i=0;i<n-j;i++){
                System.out.print("  ");
            }         
            for(int l=1;l<=2*j-1;l++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        
        
    }
}
    

