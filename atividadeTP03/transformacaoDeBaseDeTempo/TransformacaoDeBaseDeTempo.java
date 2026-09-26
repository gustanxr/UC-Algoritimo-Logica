import java.util.Scanner;

public class TransformacaoDeBaseDeTempo{
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o tempo em segundos");
        int tempo = sc.nextInt();

        int horas = tempo / 3600;
        int restoHoras = tempo % 3600;

        int minutos = restoHoras / 60;

        int segundos = restoHoras % 60;

        System.out.printf("%d hora, %d minutos e %d segundos" , horas, minutos, segundos);
    }
}
