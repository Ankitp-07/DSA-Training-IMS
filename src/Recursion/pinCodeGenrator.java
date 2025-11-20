package Recursion;

public class pinCodeGenrator {
    public static void main(String[] args) {
        int range=4; //3-6
        //pincode : 0-9
        genPinCode(range," ");
    }
    static void genPinCode(int range,String result){
        if(range==0)
        {
            System.out.print(result+",");
            return;
        }
//        genPinCode(range-1,result+0);
//        genPinCode(range-1,result+1);
//        genPinCode(range-1,result+2);
//        genPinCode(range-1,result+3);
//        genPinCode(range-1,result+4);
//        genPinCode(range-1,result+5);
//        genPinCode(range-1,result+6);
//        genPinCode(range-1,result+7);
//        genPinCode(range-1,result+8);
//        genPinCode(range-1,result+9);
        for(int i=0;i<=9;i++){
            genPinCode(range-1,result+i);
        }



    }
}
