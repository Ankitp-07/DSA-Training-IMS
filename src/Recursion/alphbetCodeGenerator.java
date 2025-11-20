package Recursion;

public class alphbetCodeGenerator {
    public static void main(String[] args) {
        int range=5; //3-6
        //pincode : 0-9
        alphaCodegen(range," ");
    }
    static void alphaCodegen(int range,String result) {
        if (range == 0) {
            System.out.print(result + ",");
            return;
        }
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            alphaCodegen(range - 1, result + ch);
        }
    }
    }



