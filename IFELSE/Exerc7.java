// Ana Beatriz Firman Batista
import java.util.Scanner;
public class Exerc7 {
    public static void main(String []args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite o salário do funcionário");
        double salário = entrada.nextDouble();
        System.out.println("Digite seu tempo de empresa (em anos)");
        int anos = entrada.nextInt();
        if (anos >= 5) {
            double bônus = salário * 0.2;
         
            System.out.println("O valor do bônus é de: " + bônus);
        } else { 
          double bônus = salário * 0.1;
          System.out.println("O valor do bônus é de: " + bônus);

        }
        entrada.close();

    }
    
}

