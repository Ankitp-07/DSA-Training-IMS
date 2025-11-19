package String;

public class factsregardingsString {
    public static void main(String[] args) {
        String str1="ankit";
        String str2="ankit";
        String str3=new String("ankit");
        System.out.println(str1==str2);  //checks on address
        System.out.println(str1.equals(str2)); //checks on value  only
        System.out.println(str1==str3);
        System.out.println(str1.equals(str3));
    }
}
