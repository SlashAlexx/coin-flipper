public class Main{
    public static void main(String[] args){
        coin my_coin = new coin();

        int heads = 0;
        int tails = 0;
        int flips = 500;
        
        for (int i = 0; i < flips; i++){
            my_coin.FlipCoin();

            if(my_coin.GetValue() == false) tails += 1;
            else heads += 1;
        }

        System.out.println("\nOut of " + flips + " coin flips: ");
        System.out.println("\tHeads: " + heads);
        System.out.println("\tTails: " + tails + "\n\n");

    }
}