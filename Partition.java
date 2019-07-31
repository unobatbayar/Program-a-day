public class Partition { 

    public static void getProduct(int n) {

        System.out.println(getProduct(n, n, ""));

    }
    public static int getProduct(int n, int max, String maximals) {
        int maximum = 0;
        if (n == 0) {

            int product = 1;

            for(int i = 0; i<maximals.length(); i++){
                product = product * Integer.valueOf(maximals.substring(i, i+1));
            }
            return product;
        }
  
        for (int i = Math.min(max, n); i >= 1; i--) {

            maximum = Math.max(maximum, getProduct(n-i, i, maximals + i));
        }

        return maximum;

    }


    public static void main(String[] args) { 
        //int n = Integer.parseInt(args[0]);
        getProduct(4);
    }

}