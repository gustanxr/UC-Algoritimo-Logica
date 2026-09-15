import java.util.Scanner;

public class VolumeSiloCilindirico{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o Raio da base em metros");
        double raio = sc.nextDouble();

        System.out.println("Insira a altura do silo em metros");
        double altura = sc.nextDouble();

        double volume = Math.PI * Math.pow(raio, 2) * altura;

        System.out.println("Volume do Silo Cilíndrico: " + volume);
    }
}