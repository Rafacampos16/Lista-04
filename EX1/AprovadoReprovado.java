import java.util.Scanner;

public class AprovadoReprovado {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in );
		
		int nota;
		
		System.out.println("Digite sua nota: ");
		nota = leia.nextInt();
		
		if (nota >= 0 && nota <= 10){
			
			if (nota < 6){
				
			System.out.print("REPROVADO");
			
			}else {
				
			System.out.print("APROVADO");
			
		}
		} else {
			
			System.out.print("VALOR INVALIDO");
			
		}
	}
}


