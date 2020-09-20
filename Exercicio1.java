import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        double num1, num2, soma = 0;
        
        System.out.println("Digite um número");
        num1 = scan.nextDouble(); 
        System.out.println("Digite outro número");
        num2 = scan.nextDouble();
        
        soma = num1 + num2;
               
        System.out.println("A soma é " + soma);
       
    }
}