package Ex_Aula04;
import java.util.Scanner;
import  java.lang.Math;

public class calculoraiz {

    public static void main(String[] args) {
        System.out.println("Este progrma Calculara a Raiz Cubica");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o Numero a Ser Calculado");
        double raizCalculada = scanner.nextInt();

        double resultado = Math.cbrt(raizCalculada);

        System.out.println(" Raiz cubica de " + raizCalculada + " é " +  resultado);
        scanner.close();
    }

}