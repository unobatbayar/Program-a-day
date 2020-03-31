import javax.swing.JOptionPane;
class roundToNearest { 
  public static void main(String args[]){
    int n = Integer.parseInt(JOptionPane.showInputDialog("Which number to round?"));
    int r = Integer.parseInt(JOptionPane.showInputDialog("Round to nearest?"));
    System.out.println(round(n, r));
  }

  public static int round(int n, int r){
    return (n + 4)/r * r;
  }
}