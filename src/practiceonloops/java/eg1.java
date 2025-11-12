package practiceonloops.java;

//prime number


public class eg1 {
    public static void main(String[] args) {
        int n = 31;
//        int factor=0;
//        for(int i=1;i<=n;i++){
//            if(n%i==0) factor++;
//        }
//        if(factor==2) System.out.println("prime number");
//        else System.out.println("not prime");
//    }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println(" prime");
                return;
            }
        }
        System.out.println("not prime");

    }
}
