import java.util.Scanner;

public class Exercice1 {
    public static void main(String[] args) {

        System.out.println("Saisir l'age de votre enfant");
        int age = new Scanner(System.in).nextInt();
        if((age>=7)&&(age<=9))
            System.out.println("poussin");
        else if ((age>=10)&&(age<=11))
            System.out.println("Pupille");
        else if ((age>=12)&&(age<=13))
            System.out.println("Benjamin");
        else if ((age>=14)&&(age<=15))
            System.out.println("Minime");
        else if ((age>=16)&&(age<=17))
            System.out.println("Cadet");
        else{
            System.out.println("aucune catégorie");
        }
    }
}
