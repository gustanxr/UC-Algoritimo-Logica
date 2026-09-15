import java.util.Scanner;

public class CalculoHipotenusa{
    public static void main(String[] agrs){

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor do catete a");
        double catetoA = sc.nextDouble();
        
        System.out.println("Insira o valor do catete b");
        double catetoB = sc.nextDouble();

        double hipotenusa = Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));

        System.out.printf("A hipotenusa de cateto a e b sera %.2f", hipotenusa);

    }
}