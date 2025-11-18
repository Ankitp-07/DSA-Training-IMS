package Recursion;

public class ep1 {
    public static void main(String[] args) {
        show(5,6);
    }
    public static void show(int x,int y){
        if(x==0|| y==0) return ;

        System.out.println(x+" "+y);
//        x--;
//        y--;                     //state maintain nahi rahega , khud ke paas hi change kar li , jab call lagwao tbhi change karo
        show(x-1,y-1);     //every call store in stack

    }
}

