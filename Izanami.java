import java.util.*;

// @author uno
//                          Izanami (イザナミ), the endless loop which can decide your destiny. Counter of Izanagi.

class Izanami
{
        public static void main (String [] args)
        {
            String moments[] = new String[5];

            for(int i = 0; i < 3; i++)
            {
                System.out.println("Your move #" + i + " Attack / Jump / Shiden (紫電) / Fireball / Dodge ( or Anything!)" );
                moments[i] = getInput();
            }

            activated(moments);    
        }

        public static String getInput()
        {  
            Scanner s = new Scanner(System.in);  
            return s.nextLine();  
        }

        public static void activated(String[] moments)
        {
            String decision;
            boolean accepted = false;
            while(accepted == false)
            {   
                System.out.println(" "); // Next loop
                for(int i = 0; i < 3; i ++)
                {
                    System.out.println("You " + moments[i] + "!" );
                }
                System.out.println("Accept what you have done, and move on to the future that awaits you?");

                decision = getInput();
                decision = decision.toLowerCase();

                if(decision.equals("yes") || decision.equals("ok"))
                {
                    accepted = true;
                    System.out.println("You have found yourself and ended the Izanami.");
                    System.exit(0);
                }
                else
                {
                    activated(moments);
                }
                
            }
        }
}
