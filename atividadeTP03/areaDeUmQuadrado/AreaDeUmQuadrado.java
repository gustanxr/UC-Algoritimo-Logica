import java.util.Scanner;

public class AreaDeUmQuadrado{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Qual tamanho do lado do quadrado: ");
        double lado = sc.nextInt();

        double result = Math.pow(lado, 2);

        System.out.println("A = " + result);

    }
}