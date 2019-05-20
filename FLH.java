import java.util.*;
/* Facebook London Hack 2019 HackerRank test rework */
class FLH{
    public static void main(String[] args){

        int l = 1;
        int r = 40;
        //create a new ArrayList
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(6);
        numbers.add(8);
        numbers.add(12);
        numbers.add(20);
        numbers.add(30);
        numbers.add(0);
        numbers.add(50);

        //sort the ArrayList
        Collections.sort(numbers);
        
        //remove bad numbers
        for(int i = 0; i<numbers.size(); i++){
            if(numbers.get(i) < l || numbers.get(i) > r) numbers.remove(i);
        }

        //get good length
        int good = 0;
        boolean first = true;
        for(int i = 0; i<numbers.size()-1; i++){
            int length = (numbers.get(i+1) - numbers.get(i));
            if(first){
                good = length;
                first = false;
            }
            else if(length > good) good = length;
            
            if(i > numbers.size()-1) i++;        
        }
        System.out.println(good);
    } 

}