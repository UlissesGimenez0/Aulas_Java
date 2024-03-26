package Ex_Aula04;
import java.util.Scanner;


public class perimetro_Quad {
    
    public static void main(String[] args) {
        
        System.out.println("Este Programa Calcula o Perimetro de um Quadrado");
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um dos Numeros (Base ou Altura)");
        double baseOuAltura = scanner.nextInt();

        double resultado = baseOuAltura  * 4;

        System.out.println( "O Perimetro do Quadrado é " + resultado);
        scanner.close();
    }

}