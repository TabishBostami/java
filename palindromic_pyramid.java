class palindromic_pyramid{
    public static void main(String[] args) {
        int n = 5;
        for(int j=1;j<=n;j++){
            for(int i=0;i<n-j;i++){
                System.out.print("  ");
            }
            for(int k =j;k>0;k--){
                System.out.print(" "+k);
            }
            for(int l=2;l<=j;l++){
                System.out.print(" "+l);
            }
            System.out.println("");
        }
    }
}