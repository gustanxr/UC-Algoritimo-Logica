package atividadeTP04.ex3;

import java.util.Scanner;

public class ExercicioTres{
    public static void main(String[] agrs){

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a primeira nota do aluno");
        double notaUm = sc.nextInt();
        
        System.out.println("Insira a segunda nota do aluno");
        double notaDois = sc.nextInt();

        double result = notaUm + notaDois / 2;

        if (result >= 6.0){
            System.out.println("Aprovado");
        }
        else{
            System.out.println("Exame");
        }
        
    }
}