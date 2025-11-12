package practiceonloops.java;

public class swapwithlastotfirst {
    public static void main(String[] args) {
        int num=12345;
        int rot=2;
        int div=(int)Math.pow(10,rot);
       int rem= num%div;
       num/=100;
       num+=rem*1000;
        System.out.println(num);




        }
    }
