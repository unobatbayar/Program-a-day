import java.util.*;
import javax.swing.JOptionPane;
/*
AUTHOR: uno
Program number 3/365
Date 22/May/2018
                                                 Spammer
                         take user input message and spam it recursively with counting number
*/
class spammer{
    public static void main (String[] args){

        String spammessage = JOptionPane.showInputDialog("What message would you want to spam?");
        int limit = Integer.parseInt(JOptionPane.showInputDialog("How many times?"));
        
        int counter = 0;
        spam(spammessage, counter,   limit);
    }
    public static void spam(String spammessage, int counter, int limit){
        if(counter <= limit){
            System.out.println(spammessage + " " + counter);
            counter = counter + 1;
            spam(spammessage, counter, limit);

        }
    }


}
