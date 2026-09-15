import java.util.Scanner;

public class VelocidadeMedia{
    public static void main(String[] agrs){

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a distancia percorrida em (km)");
        double distanciaKm = sc.nextDouble();
        
        System.out.println("Insira quantas horas durou a viagem");
        double tempo = sc.nextDouble();

        double VelocidadeMedia = distanciaKm / tempo;

        System.err.println("Velocidade Media " + VelocidadeMedia + "km/h");

    }
}