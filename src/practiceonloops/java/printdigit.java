package practiceonloops.java;
//to print 1
//         2
//         3
//         4
//         5

// Approach :  jaise ham 10 se mod lete jab hmhe last digit chayiye hota tha
                // as last digit was unit place so we are taking mod 10 , jis place ki no. print me chahyiye utne place wale se mod lenge
            // here digit in n=5 , so 1*10^n lenge

public class printdigit {
    public static void main(String[] args) {
        int n=12345;
        int pow = 10000;
        while(n>0) {
            int d = n /pow;
            System.out.println(d);
             n=n%pow;
             pow= pow/10;

        }
    }
}
