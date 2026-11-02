package arrays;

public class buy_sell_stocks {
    public static int beststock(int stocks[]){
        int buy_price = Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<stocks.length;i++){ 
            if(buy_price<stocks[i]){ 
                int profit = stocks[i]-buy_price ;
                maxprofit = Math.max(maxprofit, profit);
            }
            else{ 
                buy_price = stocks[i];
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int stocks[]={7,1,5,3,6,4};
        System.out.println(beststock(stocks));
    }
}
