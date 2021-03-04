import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scan;
    private static String[][] text = new String[12][1];

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("data.txt");
        scan = new Scanner(file);
        int i = 0;
        while (scan.hasNextLine()) {
            text[i] = scan.nextLine().split(" ");

            i++;
        }

        // todo: print alle ord der starter med det der sendes med som argument,
        //printWordsStartingWith("Ø");
        //todo: print alle ord der har præcis det antal bogstaver der sendes med som argument (inkluderer IKKE tal og tegnene '.' og ',')
        //printWordsOfLength(3);


        //test dine metoder ved at kalde dem her:
        printWordsWithDoubleConsonant("h");

    }

    private static void printWordsOfLength(int l) {
        boolean wordisvalid = true;

        for (int i = 0; i < text.length; i++) {
            for (String s : text[i]) {
                if (s.length() == l) {
                    if (s.contains(",") || s.contains(".")) {
                        wordisvalid = false;
                    }
                       /*for (int j = 0; j < s.length(); j++) {
                           char c = s.charAt(j);
                           if(c == '.' || c == ','){
                               wordisvalid = false;	
                         }
                     }*/
                    if (wordisvalid) {
                        System.out.println(s);
                    }

                }
            }
        }
    }

    private static void printWordsStartingWith(String pattern) {

        for (int i = 0; i < text.length; i++) {
            for (String s : text[i]) {
                if (s.startsWith(pattern) || s.startsWith(pattern.toLowerCase())) {
                    System.out.println(s);
                }
            }
        }
    }

    public static void isVowel(char v) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y', 'æ', 'ø', 'å'};
    }


    private static void printWordsWithDoubleConsonant(String dC) {
        for (int i = 0; i < text.length; i++) {
            for (String s : text[i]) {
                for (int j = 0; j < s.length(); j++)    {

                    String[] vowel = new String[j];
                    System.out.println(vowel);

                }

                //isVowel();
                //isVowel(s);

                //System.out.println(s);

            }
        }
    }
}


//skriv dine metoder herunder: