import javax.swing.JOptionPane;
public class ValorDoNumero
{
   public static void main (String [] args)
   {
   //declarar variáveis
   String valor;
   
   //entrada de dados
   valor = JOptionPane.showInputDialog ("Insira um número");
   
   //processamento de dados
   String exibir = valor;
   
   //saida
   
   JOptionPane.showMessageDialog(null, exibir);
   
   
   }



}