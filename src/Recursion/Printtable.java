package Recursion;

public class Printtable {
    //without  result as string

//    public static void main(String[] args) {
//        printTable(5,10);
//    }
//    static void printTable(int n , int d){
//        if(d==0) return ;
//        printTable(n,d-1);
//        System.out.println(n+" X "+d+"="+n*d);
//    }

    //with result string

    public static void main(String[] args) {
        printTable(5,10," ");
    }
    static void printTable(int n , int d,String result){
        if(d==0){
            System.out.println(result);
            return ;}
        String Expression = n+" X "+d+"="+n*d;
       // printTable(n,d-1,Expression+"\n"+result);
        printTable(n,d-1,result +"\n"+Expression);

    }

}
