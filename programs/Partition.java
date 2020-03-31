/*

Partition code was taken from: https://introcs.cs.princeton.edu/java/23recursion/Partition.java.html
I've changed and added more code to find each product and maximum of each partitions of N
@author unobatbayar
*/
public class Partition { 

    public static void getProduct(int n) {

        System.out.println("Maximum: " + getProduct(n, n, ""));

    }
    public static int getProduct(int n, int max, String maximals) {
        int maximum = 0;
        if (n == 0) {

            int product = 1;

            for(int i = 0; i<maximals.length(); i++){
                product = product * Integer.valueOf(maximals.substring(i, i+1));
            }
            System.out.println(maximals + ": " + product);
            return product;
        }
  
        for (int i = Math.min(max, n); i > 0; i--) {

            maximum = Math.max(maximum, getProduct(n-i, i, maximals + i));
        }

        return maximum;

    }


    public static void main(String[] args) { 
        // % Java Parition Product of 8
        getProduct(4);
    }

}