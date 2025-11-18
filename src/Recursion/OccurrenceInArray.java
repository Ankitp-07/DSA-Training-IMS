package Recursion;

public class OccurrenceInArray {
    private static int[] find_withindex(int[] arr,int index,int target,int count){
       if(index==arr.length){
           int[] result=new int[count];
           return result;
       }
       int[] result;
       if(arr[index]==target){
          result= find_withindex(arr,index+1,target,count+1);
          result[count]=index;
       }
       else result= find_withindex(arr,index+1,target,count);
    return result;
    }
public static void main(String[] args) {
    int[] arr = {10, 90, 20, 100, 1, 80, 10, 88, 10};
    int[] result = find_withindex(arr, 0, 10, 0);
    for (int e : result) {
        System.out.println(e);
    }
}

}
