package String;


public class searchAndreplace {
    public static void main(String[] args) {
        String result=searchandReplace("hello",'l','x');
        System.out.println(result);
    }
    static String searchandReplace(String str,char search,char replace){
        if(str.length()==0) return "";
        String oldresult= searchandReplace(str.substring(1),search,replace);
        if(str.charAt(0)==search){
            return replace+oldresult;
        }
        else{
            return str.charAt(0)+oldresult;
        }

    }
}
