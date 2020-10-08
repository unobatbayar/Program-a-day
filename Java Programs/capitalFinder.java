import java.util.HashMap;
import javax.swing.JOptionPane;
class capitalFinder { 
  public static void main(String args[]){
    //HashMap<Key,Value>()
    HashMap<String, String> capitals = new HashMap<String, String>();
    capitals.put("england", "London");
    capitals.put("mongolia", "Ulaanbaatar");
    capitals.put("japan", "Tokyo");

    String input = JOptionPane.showInputDialog("Enter a country to find capital:").toLowerCase();
    String output = "";
    if(capitals.containsKey(input)) output = capitals.get(input);
    else output = "No countries found.";
    System.out.println(output);
  }
}