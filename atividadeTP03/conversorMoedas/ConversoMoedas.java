package atividadeTP03.conversorMoedas;

import java.util.Scanner;

public class ConversoMoedas{
    public static void main(String[] agrs){

        double cotacao = 5.00;
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o valor a ser convertido por (US$): ");
        double reais = sc.nextDouble();

        double result = reais / cotacao;

        System.out.printf("Seu valor sera de (US$): %.2f $", result);
    }
}