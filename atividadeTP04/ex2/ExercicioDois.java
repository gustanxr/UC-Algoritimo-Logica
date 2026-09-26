package atividadeTP04.ex2;

import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 18){
            System.out.println("Voce esta na cateogira adulta");
        }
        else{
            System.out.println("Voce nao esta na categoria adulta");
        }

    }
}
