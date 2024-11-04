
public class ADivisivelPorBRandom {
	
	public static void main (String[] args) {
		int a = (int) (Math.random() * 1001);
		int b = (int) (Math.random() * 21);
		
		  if (a % b == 0) {
            System.out.println(a + " eh divisivel por " + b);
        } else {
            System.out.println(a + " nao eh divisivel por " + b);
        }
		
	}
}
