import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        System.out.println("saisir l'age ");
        int age = new Scanner(System.in).nextInt();
        int annee= 2022;//LocalDate.now().getYear();
        annee=annee-age;
        System.out.printf("Vous êtes né(e) en  %d",annee);

    }
}
