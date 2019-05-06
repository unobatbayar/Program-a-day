import java.util.Random;
/* Emulate 1% drop chance mounts such as
 Astral Cloud Serpent in World of Wacraft

 @author unobatbayar
*/
class dropChance{
    public static void main (String [] args){
        Random random = new Random();
        int runs = 1;
        while(runs < 101){  
            final int chance = random.nextInt(100);  
            if(chance != 1) print("Run:" + runs + " Did not drop");
            else print("Run:" + runs + " Dropped! Congratulations.");
            runs++;
        }
    }

    public static void print(String message){
        System.out.println(message);
    }
}