// Ana Beatriz Firman Batista
import java.util.Scanner;
public class Exerc2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite a idade:");
        int idade = entrada.nextInt();
        if (idade >= 18) {
            System.out.println("Maior de idade"); 
        } else { 
            System.out.println("Menor de idade");
        }
        entrada.close();
        }

    }



