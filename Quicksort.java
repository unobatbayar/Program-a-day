import java.util.*;

/*
AUTHOR: uno
Program number 4/365
23/May/2018
							Quicksort Algorithm
					Let's sort user input numbers using quicksort algorithm
*/
class Quicksort
{
	public static void main(String[] args){

	int[] userinput = new int[5];
	getinput(userinput);

	}

	public static void getinput(int[] userinput){

	Scanner s = new Scanner(System.in);

	for(int i =0; i<5;i++){
		System.out.println("Please input random numbers one by one " + i + "/5");
		userinput[i] = s.nextInt();
		}
	for(int i: userinput){ //for printing array

            System.out.println(i);

        }
	}
}


