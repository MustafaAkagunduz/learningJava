import java.util.Random;

public class CoinToss {

    public String tossACoin(){

        Random rnd= new Random();

        int coin= Math.abs(rnd.nextInt()) %2;

        if(coin==0) return "HEADS";
        else        return "TAILS";



    }
    public static void main(String[] args) {

        CoinToss ct= new CoinToss();

        int heads=0, tails=0;

        for(int i=0; i<1000; i++){

            if(ct.tossACoin().equalsIgnoreCase("HEADS")) heads++;
            else tails++;

        }

        System.out.println("HEADS: "+ heads + " TAILS: "+ tails);




    }
}