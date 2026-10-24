// Ana Beatriz Firman Batista
import java.util.Scanner;

public class Desafio{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a sua idade:");
        int idade = entrada.nextInt();


        if (idade < 16) {
            System.out.println("Não eleitor (Não pode votar).");
        } else if ((idade >= 16 && idade <= 17) || idade >= 70) {
            System.out.println("Voto facultativo.");
        } else {
            System.out.println("Voto obrigatório.");
        }

        entrada.close();
    }
}

