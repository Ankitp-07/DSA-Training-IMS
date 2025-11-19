package Recursion;

public class patternUsingrecursion {
    public static void main(String[] args) {
        printLine(5);
    }
    static void printLine(int num_of_rows){
        //base case
        if(num_of_rows==0) return;
        printLine(num_of_rows-1);
        printStar(num_of_rows);
        System.out.println();  //printing new line
    }
    static void printStar(int num_of_stars){
        if(num_of_stars==0) return ;
        System.out.print("*");
        printStar(num_of_stars-1);

    }
}
