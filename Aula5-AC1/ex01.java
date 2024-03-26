import java.util.Scanner;
import java.util.Locale;


public class ex01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Este Programa Calculará Sua Média");

//O Numero de Materias será baseado no Curso de Analise e Desenvolvimento de Sistemas da FACENS
        
        System.out.println("Digite aqui sua Nota da AC1");
        double notaAc1 = scanner.nextDouble();

        System.out.println("===================================================");
        System.out.println("Digite aqui sua Nota da AC2");
        double notaAc2 = scanner.nextDouble();

        System.out.println("===================================================");
        System.out.println("Digite aqui sua Nota da AG");
        double notaAg = scanner.nextDouble();

        System.out.println("===================================================");
        System.out.println("Digite aqui sua QNota da AF");
        double notaAf = scanner.nextDouble();



        double media = (notaAc1 * 0.15) + (notaAc2 *0.30) + (notaAg * 0.10) + (notaAf * 0.45);

        System.out.printf("Baseado nas suas Notas, Sua média é %.1f\n" , media);
    }
}