import javax.swing.JOptionPane;
public class ExibeTresFrasesAoContrario
{
   public static void main (String [] args) 
   {
      //declarar variaveis
      String palavra1;
      String palavra2;
      String palavra3;
      
      //entrada de dados
      palavra1 = JOptionPane.showInputDialog ("Digite a primeira palavra");
      palavra2 = JOptionPane.showInputDialog ("Digite a segunda palavra");
      palavra3 = JOptionPane.showInputDialog ("Digite a terceira palavra");
      
      //processamento
      String resultado = palavra3 + " " + palavra2 + " " + palavra1;
      
      //sa�da
      JOptionPane.showMessageDialog (null, resultado); 
   }
  



}