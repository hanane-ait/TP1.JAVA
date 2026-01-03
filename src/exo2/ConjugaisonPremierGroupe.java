package exo2;
import java.util.Scanner;
public class ConjugaisonPremierGroupe {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first group verb: ");
        String verbe= scanner.nextLine();
        if(verbe.endsWith("er")){
            String redical = verbe.substring(0,verbe.length()-2);
            System.out.println("Je " + redical + "e");
            System.out.println("Tu " + redical + "es");
            System.out.println("Elle/Il " + redical + "e");
            System.out.println("Nous " + redical + "ons");
            System.out.println("Vous " + redical + "ez");
            System.out.println("Elles/Ils " + redical + "ent");
        }
        else{
            System.out.println("Error: this verb does not belong to the first group");
        }
        scanner.close();

    }
}
