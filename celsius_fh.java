import java.util.Scanner;

public class celsius_fh {

    public static void main(String[] args) {

        System.out.println("Este Programa Transcreve Graus Celsius Em Fahrenheit");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os ºC (Graus em Celsius)");
        double firstnumber = scanner.nextInt();

        double resultado = (firstnumber * 1.8 ) + 32;

        System.out.println("A Temperatura em Fahrenheit é " + resultado);
    }
}
