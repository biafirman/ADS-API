// Ana Beatriz Firman Batista
import java.util.Scanner;
public class Exerc1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
     
        System.out.println("Digite um número inteiro:");
        int número = entrada.nextInt();
        if (número > 20) {
            double metade = número / 2.0;
        System.out.println("A metade é: " + metade);

        }
        entrada.close();

    }

}
