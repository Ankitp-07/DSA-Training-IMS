package String;

public class reverseString {
    public static void main(String[] args) {
        String rev= reverse("ANkit");
        String str="patel";
//String twopointer=twoPointer(str,0,str.length()-1);
        System.out.println(rev);
        //System.out.println(twopointer);
    }
    static String reverse(String str){
        if(str.length()==0) return "";
        String oldresult= reverse(str.substring(1));
        char newresult=str.charAt(0);
        return oldresult+newresult;



        }
//        private static String twoPointer(String str,int left,int right){
//        if(left<right){
//            char left=str.charAt(left);
//            char temp=str.charAt(left);
//            str.charAt(left)=str.charAt(right);
//    }

}
