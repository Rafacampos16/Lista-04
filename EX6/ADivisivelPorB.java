import java.util.Scanner;

public class ADivisivelPorB {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in );
		
		int a, b;
		
		System.out.println("Entre com o valor de a: ");
		a = leia.nextInt();
		System.out.println("Entre com o valor de b: ");
		b = leia.nextInt();
		
		if (a < 0 || a > 1000 || b < 0 || b > 20){
			System.out.println("VALOR INVALIDO");
		} else if (!( a >= b )) {
			System.out.print("A nao eh maior nem igual a B");
		} else if (a % b == 0) {
            System.out.println(a + " eh divisivel por " + b);
        } else {
            System.out.println(a + " nao eh divisivel por " + b);
        }
	}
}

/*Crie um arquivo chamado ADivisivelPorB.java. Implemente um programa em Java que guarde
dois valores numéricos inteiros: a e b, informados pelo usuário, sendo a de 0 até 1000 (inclusos) e b
de 0 a 20 (inclusos). Valide os valores digitados pelo usuário, informando caso não sejam validos.
Valide, também, se o valor de 1 é maior ou igual ao valor de b, caso não seja, informe ao usuário.
Exiba na saída padrão a mensagem É divisível quando a for divisível por b ou a mensagem Não é
divisível, caso contrário. */
