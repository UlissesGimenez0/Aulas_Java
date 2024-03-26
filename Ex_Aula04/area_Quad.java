package Ex_Aula04;
import java.util.Scanner;
import  java.lang.Math;

public class area_Quad {
    
        public static void main(String[] args) {
        
        System.out.println("Este Programa Calcula a area de um Quadrado");
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um dos Lados do Quadrado (Base ou Altura)");
        double firstnumber = scanner.nextInt();

        double resultado = Math.pow(firstnumber, 2) ;

        System.out.println( "a Aréa do Quadrado é " + resultado);
    }

}
