import java.util.Scanner;

public class ReaisEmDolar{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a cotacao do dolar autal");
        double cotacao = sc.nextDouble();
        
        System.out.println("Insira a quantia em R$ que voce possui");
        double reais = sc.nextDouble();
        
        double dolar = reais / cotacao;

        System.out.println("Seu saldo sera de " + dolar + "$ dolares");
    }
}