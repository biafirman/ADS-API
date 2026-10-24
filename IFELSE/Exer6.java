// Ana Beatriz Firman Batista
import java.util.Scanner;

public class Exer6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite sua altura (ex: 1.70):");

    double altura = entrada.nextDouble();

        System.out.println("Digite o sexo (M para masculino ou F para feminino):");
        char sexo = entrada.next().toUpperCase().charAt(0);
    
    double pesoIdeal;
    
    if (sexo == 'M') {
        pesoIdeal = (72.7 * altura) - 58;
        System.out.println("Seu peso ideal é: " + pesoIdeal + " kg");
        }
    else if (sexo == 'F') {
        pesoIdeal = (62.1 * altura) - 44.7;
    System.out.println("Seu peso ideal é: " + pesoIdeal + " kg");

} 
entrada.close();
}
}
