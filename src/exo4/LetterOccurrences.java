package exo4;
import java.util.Scanner;
public class LetterOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] nb_occurence = new int[26];
        System.out.println("Enter a line of text");
        String ch = sc.nextLine();
        ch = ch.toUpperCase();
        for (int i =0 ; i<ch.length();i++){
            char c =ch.charAt(i);//recupere le caractere de position i
            if( c>='A' && c <='Z'){
                nb_occurence[c - 'A']++;
            }
        }

        System.out.println("The string " + ch + " contains");
        for(int i=0;i<26;i++){
            if( nb_occurence[i]>0){
                char lettre = (char) (i + 'A'); // transforme l'index en lettre
                int occur = nb_occurence[i];
                String pluriel = (occur > 1) ? "occurrences" : "occurrence";
                System.out.println(occur + " " + pluriel + " of the letter '" + lettre + "'");
            }
        }
        sc.close();
    }
}
