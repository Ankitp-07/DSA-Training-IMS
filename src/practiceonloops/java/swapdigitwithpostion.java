package practiceonloops.java;

public class swapdigitwithpostion {
    public static void main(String[] args) {
        int n=216435;
        int position=0;
        int sum=0;
        while(n>0){
            position++;
            int d= n%10;
//            position+=d*10^i;
            sum+= position * (int) Math.pow(10,d-1);
            n/=10;
        }
        System.out.println(sum);


    }
}
