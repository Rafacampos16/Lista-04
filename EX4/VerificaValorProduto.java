import java.util.Scanner;

public class VerificaValorProduto {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in );
		
		int precoProduto1, precoProduto2;
		
		System.out.println("Entre com o valor do produto 1: ");
		precoProduto1 = leia.nextInt();
		System.out.println("Entre com o valor do produto 2: ");
		precoProduto2 = leia.nextInt();
		
		if (precoProduto1 < 1  || precoProduto1 > 1000 || precoProduto2 < 1  || precoProduto2 > 1000){
			System.out.println("VALOR INVALIDO");
		} else {
			if (precoProduto1 < precoProduto2){
			System.out.print("O produto 1 eh o mais barato!");
		} else if (precoProduto1 == precoProduto2){
			System.out.print("Os produtos possuem o mesmo preco");
		} else {
			System.out.println("O produto 2 eh o mais barato!");
		}
		}
	}
}

