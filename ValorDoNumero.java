import javax.swing.JOptionPane;
public class ValorDoNumero
{
   public static void main (String [] args)
   {
   //declarar vari�veis
   String valor;
   
   //entrada de dados
   valor = JOptionPane.showInputDialog ("Insira um n�mero");
   
   //processamento de dados
   String exibir = valor;
   
   //saida
   
   JOptionPane.showMessageDialog(null, exibir);
   
   
   }



}