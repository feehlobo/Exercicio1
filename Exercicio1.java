import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        double num1, num2, soma = 0;
        
        System.out.println("Digite um n�mero");
        num1 = scan.nextDouble(); 
        System.out.println("Digite outro n�mero");
        num2 = scan.nextDouble();
        
        soma = num1 + num2;
               
        System.out.println("A soma � " + soma);
       
    }
}