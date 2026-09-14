import java.util.Scanner;

public class ConsumoEnergetico {
    public static void main(String[] args){

        int dias = 30;
        int conversorDeWatsEmKWh = 1000;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a potencia do aparelho");
        double potencia = sc.nextDouble();
        
        System.out.println("Insira as horas de uso do aparelho por dia");
        double horasDeUso = sc.nextDouble();
        
        System.out.println("Insira o preco do KWh");
        double precoKWh = sc.nextDouble();

        double custo = potencia * horasDeUso * dias * precoKWh / conversorDeWatsEmKWh;

        System.out.printf("Seu custo mensal e de %.2f R$", custo);
    }
}