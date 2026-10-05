package atividadeTP04.ex5;

import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] agrs){

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um numero:");
        int numb = sc.nextInt();

        int resultCinco = numb % 5;
        int resultTres = numb % 3;
        
        if (resultCinco == 0 && resultTres == 0){
            System.out.println("Este numero e multiplo de 5 e 3");
        }
        else{
            System.out.println("Este numero não e multiplo de 5 e 3");
        }
    }
}
