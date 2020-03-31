import java.util.*;
/* 
@author unobatbayar 
funny little program, saw it on the internet, created my version
*/
class toohigh{
    public static void main (String[] args){

    print("Enter a number between 1 to 10");
    int number = getInput(); 

    if(number < 1) print("Too low.");
    else if(number == 420) print("Blaze It"); 
    else if(number > 10) print("Too high."); 
    else print("Great.");
        
    }
    public static int getInput(){  //get user input as int
        Scanner scanner = new Scanner(System.in);  
		return scanner.nextInt();  
    }

    public static void print(String message){
        System.out.println(message);
    }
}
