import java.util.Scanner;

public class Vigenere {
    public static char encryptCaesarKey(char letter, char keyin) {
                if ( (65 <= letter) && (letter <= 90) ) {
                    int diff = letter - (65 - keyin);
                    if ( (diff > 25) && (diff <= (25 + keyin)) ) {
                        diff = diff % 26;
                    }
                    int diff2 = diff + 65;
                    letter = (char) (diff2);
                }
                else if ( ( 97 <= letter) && (letter <= 122) ) {
                    int diff = letter - (97 - keyin);
                    if ( (diff > 25) && (diff <= (25 + keyin)) ) {
                        diff = diff % 26;
                    }
                    int diff4 = diff + 97;
                    letter = (char) (diff4);

            }
                else {

            }
            return letter;

        }

    public static String encryptVigenere(String message, String key) {
        int len1 = key.length();
        String str = "";
        for (int i = 0; i < len1; i++) {
            char ch = message.charAt(i);
            char keyin = key.charAt(i);
            if ((keyin >= 97) && (keyin <= 122)) {
                int keyin2 =  keyin - 97;
                char keyin3 = (char) (keyin2);
            }
            else if ( (keyin >= 65) && (keyin <= 90)){
                int keyin2 = keyin - 65;
                char keyin3 = (char) (keyin2);
            }
            str += encryptCaesarKey(ch, keyin3);
            }
        return str;
        }

    public static String decryptVigenere(String message, String key) {
            return message;
    }


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Would you like to \"encrypt\" or \"decrypt\" a message?");
            String command = scan.nextLine().trim().toLowerCase();

            if (command.equals("encrypt")) {
                System.out.println("Please enter your message to be encrypted: ");
                String message = scan.nextLine();
                System.out.println("Please enter the key for your message: ");
                String key = scan.nextLine().trim().toUpperCase();
                System.out.println("Here is your encrypted message: ");
                System.out.println(encryptVigenere(message, key));
            }
            else if (command.equals("decrypt")) {
                System.out.println("Please enter your message to be decrypted: ");
                String message = scan.nextLine();
                System.out.println("Please enter the key for your message: ");
                String key = scan.nextLine().trim().toUpperCase();
                System.out.println("Here is your decrypted message: ");
                System.out.println(decryptVigenere(message, key));
            }
            else {
                System.out.println("Unknown command; please type either \"encrypt\" or \"decrypt\"");
            }

            scan.close();
        }
    }