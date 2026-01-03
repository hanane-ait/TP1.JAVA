package exo3;
import java.util.Scanner;
public class StringOperations {
    private String texte;
    public void entertexte(Scanner sc){
        System.out.println("Enter a string of characters");
        texte=sc.nextLine();
    }
    public void display( ){
        if (texte==null){
            System.out.println("No string zas captured");
        }
        else{
            System.out.println("string entered "+ texte);
        }
    }
    public void reversed(){
        if (texte==null){
            System.out.println("No string zas captured");
        }
        else{
            String inverse= new StringBuilder(texte).reverse().toString();
            System.out.println("string entered "+ inverse);
        }
    }
    public void wordcount(){
        if (texte==null || texte.trim().isEmpty()){
            System.out.println("No string zas captured");
        }
        else{
            String[] mots = texte.trim().split("\\s+");
            System.out.println(" Number of words "+ mots.length);
        }
    }

    public void pause(Scanner sc) {
        System.out.println("Press any key to return to the menu.");
        sc.nextLine();
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringOperations operation = new StringOperations();
        int choice;
        do{
            System.out.println(" Menu ");
            System.out.println("1. Enter ");
            System.out.println("2. Display ");
            System.out.println("3. Reverse ");
            System.out.println("4. Number of words ");
            System.out.println("5. exit ");
            System.out.println("Your choice: ");
            choice= sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                     operation.entertexte(sc);
                     operation.pause(sc);
                     break;
                case 2:
                     operation.display();
                     operation.pause(sc);
                     break;
                case 3:
                     operation.reversed();
                     operation.pause(sc);
                     break;
                case 4:
                     operation.wordcount();
                     operation.pause(sc);
                     break;
                case 5:
                   System.out.println("Program completed");
                default:
                    System.out.println("invalid choice");

            }

        }while(choice!=5);
        sc.close();

    }
}

