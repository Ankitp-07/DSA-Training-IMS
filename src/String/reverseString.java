package String;

public class reverseString {
    public static void main(String[] args) {
        String rev= reverse("ANkit");
        System.out.println(rev);
    }
    static String reverse(String str){
        if(str.length()==0) return "";
        String oldresult= reverse(str.substring(1));
        char newresult=str.charAt(0);
        return oldresult+newresult;
    }

}
