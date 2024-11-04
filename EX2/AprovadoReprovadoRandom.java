
public class AprovadoReprovadoRandom {
	
	public static void main (String[] args) {
		int nota = (int) (Math.random() * 11);
        System.out.println("Nota aleatoria: " + nota);
        
        if (nota < 6){
			System.out.print("REPROVADO");
		} else {
			System.out.print("APROVADO");
		}
	}
}

/*Gere um número aleatório com
valores entre 0 e 10 (inclusos) e atribua a variável nota. O programa deve exibir a mensagem
REPROVADO quando a nota do aluno for menor do que 6 ou APROVADO caso contrário. */
