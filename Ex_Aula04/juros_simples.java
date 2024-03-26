package Ex_Aula04;
import java.util.Scanner;

public class juros_simples {

    public static void main(String[] args) {
        System.out.println("Este programa fará o calculo de Juros Simples");
        Scanner scanner = new Scanner(System.in);

        System.out.println("DIgite o Capital aplicado");
        double capitalaplicado = scanner.nextInt();

        System.out.println("DIgite o Juro a Ser aplicado");
        double juroaplicado = scanner.nextInt();
      
        System.out.println("DIgite o Tempo a Ser aplicado");
        double tempoaplicado = scanner.nextInt();

        double juros = (juroaplicado / 100) * capitalaplicado * tempoaplicado; 

        System.out.println("O valor aplicado retornará o seguinte valor: " + juros);
        scanner.close();
    }
}
