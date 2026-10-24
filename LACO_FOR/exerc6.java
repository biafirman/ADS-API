// Ana Beatriz Firman Batista

import java.util.Scanner;
public class exerc6{
    public static void main (String[]args){

        try (Scanner entrada = new Scanner(System.in)) {

        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;
        int candidato4 = 0;
        int nulo = 0;
        int branco = 0;

        for (int cont = 1; cont <= 10; cont++){

        System.out.println("Digite o seu voto: ");
        int voto = entrada.nextInt();

        switch (voto) {
            case 1 -> candidato1++;
            case 2 -> candidato2++;
            case 3 -> candidato3++;
            case 4 -> candidato4++;
            case 5 -> nulo++;
            case 6 -> branco++;
            default -> System.out.println("Código inválido!");
        }

        System.out.println();
    }

    double percentualBrancosNulos = ((double) (branco + nulo) / 10.0) * 100.0;

    System.out.println("RESULTADO");
    System.out.println("Total de votos para cada candidato: ");
    System.out.println("  - Candidato 1: " + candidato1);
    System.out.println("  - Candidoto 2: " + candidato2);
    System.out.println("  - Candidato 3: " + candidato3);
    System.out.println("  - Candidato 4: " + candidato4);
    System.out.println("Total de votos nulos: " + nulo);
    System.out.println("Total de votos em branco: " + branco);
    System.out.printf("Percentual de votos brancos e nulos %.2f%%n: ", percentualBrancosNulos);

  
    }
}
}
