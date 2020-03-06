import javax.swing.*;
public class Exercicioc
{
   public static int somaNInteiros(int n)
   {
      if (n == 0) return 0;
      else return somaNInteiros (n - 1) + n;
   }
      public static void main(String args[])
      {
         int x = Integer.parseInt(JOptionPane.showInputDialog("x = ?"));
         JOptionPane.showMessageDialog(null, "resposta =" + somaNInteiros(x));
      }
}