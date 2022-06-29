import java.util.Scanner;

public class Exercice2 {
    public static void main(String[] args) {
        System.out.println("Saisir le diametre");
        double diametre = new Scanner(System.in).nextDouble();

        double rayon = diametre / 2;
        double pi = 3.14;
        double surface = rayon * rayon * pi;
        
        System.out.printf("la surface est  %f" ,surface);
    }

}
