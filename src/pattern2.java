public class pattern2 {
    public static void main(String[] args) {
        int n=5;
        int k=0;
        for(int i=1;i<=2*n-1;i++){
            if(i<=n) k++;
            else k--;
            for(int j=0;j<k;j++){
                System.out.print(" "+"*");
            }
            System.out.println();
        }
    }
}
