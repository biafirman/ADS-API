// Ana Beatriz Firman Batista

import java.util.Scanner;
public class exerc3 {
    public static void main(String[]args){
      try (Scanner entrada = new Scanner (System.in)) {

        int numero;

        System.out.println("Digite um número inteiro: ");
        numero = entrada.nextInt(); 

        for (int cont = 1; cont <= numero; cont++){

            System.out.println("Sequência: " + cont);
        }

        entrada.close();
    
    }
    }
}
