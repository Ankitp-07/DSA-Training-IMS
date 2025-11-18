package Recursion;

public class getpriceswithgst {
    public static void main(String[] args) {
    int[] prices={100,200,430,999,777};
    int[] newprices=getPricesWithGST(prices,0);
    for(int p: newprices){
        System.out.println(p);
    }
    }

    private static int[] getPricesWithGST(int[] prices, int i) {
        if(i==prices.length-1) {
            int[] gst=new int[prices.length];
            return gst;
        }
        int[] gst= getPricesWithGST(prices,i+1);
        gst[i]=prices[i]+(int)(prices[i]*0.18);
        return gst;
    }
}
