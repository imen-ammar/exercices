import java.util.Scanner;

public class Exercice3 {
    public static void main(String[] args) {
        System.out.println("Saisir le nom");
        String nom = new Scanner(System.in).nextLine();

        System.out.println("Saisir le prenom");
        String prenom = new Scanner(System.in).nextLine();

        System.out.println("Saisir le age");
        int age = new Scanner(System.in).nextInt();

        System.out.printf("Vous vous appelez  %s %s, et vous avez %d ans",prenom,nom,age);
    }

}
