import java.util.Scanner;

public class ArmazenamentoEApresentacao {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Insira seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Insira sua idade: ");
        int idade = sc.nextInt();

        System.out.print("Qual sua altura: ");
        double altura = sc.nextDouble();

        System.out.printf("Ola sou o %s tenho %d anos e minha altura e %.2f m", nome, idade, altura);
    }
}
