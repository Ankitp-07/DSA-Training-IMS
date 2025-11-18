package Recursion;

public class ep2 {
    public static void main(String[] args) {
        System.out.println( fact(5 , 1));
    }
    public static int fact(int n , int result){
        if(n==0) return result;
        return fact(n-1,n*result);
    }


}
