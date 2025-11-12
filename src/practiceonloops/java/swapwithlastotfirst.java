package practiceonloops.java;

public class swapwithlastotfirst {
    public static void main(String[] args) {
        int num=12345;
        int rot=2;
        int copy=num;
        //counting the digits
        int countdigit=0;
        while(num>0){
            countdigit++;
            num=num/10;
        }
        System.out.println(countdigit);
        num=copy;
        int div=(int)Math.pow(10,rot);
       int rem= num%div;
       num/=100;
       num+=rem*(int)Math.pow(10,countdigit-rot);
        System.out.println(num);




        }
    }
