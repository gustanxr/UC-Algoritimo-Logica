package atividadeTP03.calculoMedia;

import java.util.Scanner;

public class CalculoMedia {
    public static void main(String[] agrs){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira Primeira nota do aluno: ");
        double notaUm = sc.nextDouble(); 
        
        System.out.print("Insira Segunda nota do aluno: ");
        double notaDois = sc.nextDouble(); 

        System.out.print("Insira Terceira nota do aluno: ");
        double notaTres = sc.nextDouble(); 

        double result = (notaUm + notaDois + notaTres) / 3;

        System.out.printf("A media do aluno e: %.2f", result);

    }
}
