package atividadeTP04.ex6;

import java.util.Scanner;

public class ExercicoSeis {
    public static void main(String[] agrs){

        Scanner sc = new Scanner(System.in);

        System.out.print("Em que ano voce nasceu:");
        int nasc = sc.nextInt();
        
        System.out.print("Insira o ano atual:");
        int anoAtual = sc.nextInt();

        int idade = anoAtual - nasc;

        if(idade == 16){
            System.out.println("Voce pode votar");
        }
        if(idade == 18){
            System.out.println("Voce pode dirigir");
        }
    }
}
