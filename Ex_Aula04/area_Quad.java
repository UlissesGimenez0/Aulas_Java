package Ex_Aula04;
import java.util.Scanner;
import  java.lang.Math;

public class area_Quad {
    
        public static void main(String[] args) {
        
        System.out.println("Este Programa Calcula a area de um Quadrado");
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um dos Lados do Quadrado (Base ou Altura)");
        double baseOuAltura = scanner.nextInt();

        double resultado = Math.pow(baseOuAltura, 2) ;

        System.out.println( "a Aréa do Quadrado é " + resultado);
        scanner.close();
    }

}
