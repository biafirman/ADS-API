// Ana Beatriz Firman Batista
import java.util.Scanner;

public class Exerc5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número:");
        int num = entrada.nextInt();
        if (num >= 50 && num <= 100){ 
        System.out.println("Pertence ao intervalo");
        } else { 
            System.out.println("Não pertence ao intervalo");
        }
        entrada.close();
            }
        }
    
