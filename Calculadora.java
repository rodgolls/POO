public class Calculadora {
	public static void main (String [] args){
		Scanner ent = new scanner(System.in);
		
		double num, num2, soma, mult, div, sub = 0;
		
	do{
		System.out.println("Digite um numero inteiro positivo");
		num = ent.nextDouble();
		System.out.println("Digite um numero inteiro positivo");
		num2 = ent.nextDouble();
		
		if(num >= 0){
			
			if num2 >= 0){
				
			soma = num + num2;
			sub = num - num2;
			mult = num * num2;
			div = num / num2;
			
			}
		}
		System.out.println("A soma e " + soma);
		System.out.println("A subtracao e " + sub);
		System.out.println("A multiplicacao e " + mult);
		System.out.println("A divisao e " + div);
	}