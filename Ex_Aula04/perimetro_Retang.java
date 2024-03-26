package Ex_Aula04;
import java.util.Scanner;


public class perimetro_Retang {
    
    public static void main(String[] args) {
        
        System.out.println("Este Programa Calcula o Perimetro de um Retangulo");
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a Base");
        double firstnumber = scanner.nextInt();

        System.out.println("Digite a Altura");
        double secondnumber = scanner.nextInt();

        double resultado = (firstnumber + secondnumber) * 2;

        System.out.println( resultado);
        scanner.close();
    }

}
