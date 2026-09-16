package atividadeTP03.calculoIMC;

import java.util.Scanner;

public class CalculoImc {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira seu peso (Kg): ");
        double peso = sc.nextDouble();
        
        System.out.print("Insira sua altura (m): ");
        double altura = sc.nextDouble();

        double result = peso / Math.pow(altura, 2);

        System.out.printf("Seu IMC: %.2f", result);

    }
}