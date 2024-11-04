
public class VerificaValorProdutoRandom {
	
	public static void main (String[] args) {
		int precoProduto1 = (int) (Math.random() * 1000);
		int precoProduto2 = (int) (Math.random() * 1000);
		
		System.out.println("Produto 1: " + precoProduto1);
		System.out.println("Produto 2: " + precoProduto2);
		
		if (precoProduto1 < precoProduto2){
			System.out.print("O produto 1 eh o mais barato!");
		} else if (precoProduto1 == precoProduto2){
			System.out.print("Os produtos possuem o mesmo preco");
		} else {
			System.out.println("O produto 2 eh o mais barato!");
		}
		
	}
}


