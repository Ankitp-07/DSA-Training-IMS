package Recursion;

public class TreeUsingRecursion {
    public static void main(String[] args) {
        tree(5);

    }
    static void tree(int num){
        if(num<=0) return;
        System.out.println("precall"+num);
        tree(num-1);
        System.out.println("post call(num-1)"+num);
        tree(num-2);
        System.out.println("post call(num-2)"+num);
        tree(num-3);
        System.out.println("post call(num-3)"+num);
        tree(num-4);
        System.out.println("post call(num-4)"+num);
        tree(num-5);
        System.out.println("post call(num-5)"+num);

    }
}
