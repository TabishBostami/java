public class butterfly_ptrn {
    public static void main(String[] args) {
        int n=4;
        // int m = 3;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
            for(int k =0;k<2*(n-i);k++){
                System.out.print("  ");
            
            }
            for(int l=0;l<i;l++){
                System.out.print("* ");

            }
            // m=m-1;
            System.out.println(" ");
            

        }
        // lower half
        for(int i=n;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
            for(int k =0;k<2*(n-i);k++){
                System.out.print("  ");
            
            }
            for(int l=0;l<i;l++){
                System.out.print("* ");

            }
            
            System.out.println(" ");
        }
    }
}
