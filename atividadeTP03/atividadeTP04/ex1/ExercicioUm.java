import java.util.Scanner;

public class ExercicioUm{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um numero");
        int numb = sc.nextInt();
        
        if (numb < 0){
            System.out.println("Numero e negativo");
        }
        else{
            System.out.println("Numero e positivo");
        }
        
    }
}