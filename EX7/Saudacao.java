import java.util.Scanner;

public class Saudacao {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Voce deseja informar a hora manualmente (1) ou gerar aleatoriamente (2)?");
        int escolha = leia.nextInt();

        int hora;  

        if (escolha == 1) {
            System.out.println("Informe a hora do dia (0 a 23): ");
            hora = leia.nextInt();

            if (hora < 0 || hora > 23) {
                System.out.println("Hora inválida. Insira um valor entre 0 e 23.");
                return;
            }

        } else if (escolha == 2) {
            hora = (int) (Math.random() * 24);
            System.out.println("Hora gerada aleatoriamente: " + hora);

        } else {
            System.out.println("Opcaoo invalida.");
            return;
        }

        if (hora >= 0 && hora <= 6) {
            System.out.println("Zzzzz");
        } else if (hora >= 7 && hora <= 11) {
            System.out.println("Bom dia");
        } else if (hora >= 12 && hora <= 17) {
            System.out.println("Boa tarde");
        } else if (hora >= 18 && hora <= 23) {
            System.out.println("Boa noite");
        }
    }
}
