package Recursion;

public class ArrrayIsSortedOrNot {
    public static void main(String[] args) {
        //int arr[]={10,80,30,3200,1};
        int arr[]={1,2,3,4,5};
        System.out.println(IsSorted(arr,1));
    }
    private static boolean IsSorted(int[] arr,int n){
        if(n==arr.length-1) return true;
        if(arr[n]<arr[n-1]) return false;
        return IsSorted(arr,n+1);
    }
}
