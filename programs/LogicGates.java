import java.util.*;
/*
@author uno 
@program #8
@date 21-02-2019
                                                 Logic Gates
                               prints out truth table about each basic logic gates
*/
class LogicGates{
    public static void main (String[] args){

        introduction();
        program();
        
    }
    public static void introduction(){
        String rules = "\n" + "Welcome to Logic Gates program by Uno!" + "\n" 
        + "1) Type the gate name you want to learn from the following list." + "\n" 
        + "2) Type 'gates' to see the this again." + "\n"
        + "3) Type 'exit' to exit the program." + "\n";
        print(rules);

        // all basic Logic gates
        String logicGates [] = new String[8];
        logicGates[0] = "\n" + "AND";
        logicGates[1] = "OR";
        logicGates[2] = "XOR";
        logicGates[3] = "NAND";
        logicGates[4] = "NOR";
        logicGates[5] = "XNOR";
        logicGates[6] = "Buffer";
        logicGates[7] = "Inverter" + "\n";
        
        for(int i = 0; i < 8; i++){
            print(logicGates[i]);
        }
    
    }
    public static void print(String message){
        System.out.println(message);
    }
    
    public static void program(){
        String input = getInput();
        if(input.toLowerCase().equals("and")){
            print("\n" + 
            "AND GATE" + "\n" +
            "F = AB" + "\n" +
            "A B | F" + "\n" +
            "0 0 | 0" + "\n" +
            "0 1 | 0" + "\n" +
            "1 0 | 0" + "\n" +
            "1 1 | 1" + "\n");
        }
        else if(input.toLowerCase().equals("or")){
            print("\n" + 
            "OR GATE" + "\n" +
            "F = A+B" + "\n" +
            "A B | F" + "\n" +
            "0 0 | 0" + "\n" +
            "0 1 | 1" + "\n" +
            "1 0 | 1" + "\n" +
            "1 1 | 1" + "\n");
        }   
        else if(input.toLowerCase().equals("xor")){
            print("\n" + 
            "XOR GATE" + "\n" +
            "F = A㊉B" + "\n" +
            "A B | F" + "\n" +
            "0 0 | 0" + "\n" +
            "0 1 | 1" + "\n" +
            "1 0 | 1" + "\n" +
            "1 1 | 0" + "\n");
        }
        else if(input.toLowerCase().equals("nand")){
            print("\n" + 
            "NAND GATE" + "\n" +
            "    __" + "\n" +
            "F = AB" + "\n" +
            "A B | F" + "\n" +
            "0 0 | 1" + "\n" +
            "0 1 | 1" + "\n" +
            "1 0 | 1" + "\n" +
            "1 1 | 0" + "\n");
        }
        else if(input.toLowerCase().equals("nor")){
            print("\n" + 
            "NOR GATE" + "\n" +
            "    ___" + "\n" +
            "F = A+B" + "\n" +
            "A B | F" + "\n" +
            "0 0 | 1" + "\n" +
            "0 1 | 0" + "\n" +
            "1 0 | 0" + "\n" +
            "1 1 | 0" + "\n");
        }
        else if(input.toLowerCase().equals("xnor")){
            print("\n" + 
            "XNOR GATE" + "\n" +
            "    ___" + "\n" +
            "F = A㊉B" + "\n" +
            "A B | F" + "\n" +
            "0 0 | 1" + "\n" +
            "0 1 | 1" + "\n" +
            "1 0 | 0" + "\n" +
            "1 1 | 1" + "\n");
        }
        else if(input.toLowerCase().equals("buffer")){
            print("\n" + 
            "BUFFER" + "\n" +
            "F = A" + "\n" +
            "A | F" + "\n" +
            "0 | 0" + "\n" +
            "1 | 1" + "\n");
        }
        else if(input.toLowerCase().equals("inverter")){
            print("\n" + 
            "INVERTER" + "\n" +
            "    _" + "\n" +
            "F = A" + "\n" +
            "A | F" + "\n" +
            "0 | 1" + "\n" +
            "1 | 0" + "\n");
        }
        else if (input.toLowerCase().equals("exit")){
            print("Thanks for trying my program!");
            System.exit(0);
        }
        else if (input.toLowerCase().equals("gates")){
            introduction();
        }
        else{
            print("Sorry, please try again:" + "\n");

        }
        // Repeat
        program();
        
    }


    public static String getInput()
    {  
        Scanner s = new Scanner(System.in);  
        return s.nextLine();  
    }

}
