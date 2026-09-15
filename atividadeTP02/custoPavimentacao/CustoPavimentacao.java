import java.util.Scanner;

public class CustoPavimentacao {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o raio da praca");
        double raio = sc.nextDouble();
        
        double areaTotal = Math.PI * Math.pow(raio, 2);
        
        System.out.printf("A area total e de %.2fm²\n", areaTotal);
        
        System.out.println("Insira o valor do material desejado");
        double valor = sc.nextDouble();

        double custo = areaTotal * valor;

        System.out.printf("E o custo total sera e de %.2f R$", custo);

    }
}
