import java.util.Scanner;

public class Caesar {
    public static String encryptCaesar(String message) {
        int len = message.length();
        String str2 = "";
        for (int i = 0; i < len; i++) {
            char ch = message.charAt(i);
            if ( (97 <= ch) && (ch <= 122) ) {
                int diff = (ch - 97)%26;
                int diff2 = diff + 3;
                ch = (char) (diff2);
                str2 += ch;
            }
            else if ( (122 < ch) || (ch < 97)) {
                ch = (char) (ch);
                str2 += ch;
            }

        }
        return str2;
    }

    public static String decryptCaesar(String message) {
        int len = message.length();
        String str2 = "";
        for (int i = 0; i < len; i++) {
            char ch = message.charAt(i);
            if ( (97 <= ch) && (ch <= 122) ) {
                int diff = ch - 3;
                ch = (char) (diff);
                str2 += ch;
  
            }
             else if ( (120 <= ch) && (ch<= 122) ){
                int diff = ch - 23;
                ch = (char) (diff);
                str2 += ch;

             }

            else if ( (122 < ch) || (ch < 97)){
                ch = (char) (ch);
                str2 += ch;
            }

        }
        return str2;
    }

    public static String encryptCaesarKey(String message, int key) {
        return message;
        // REPLACE THIS WITH YOUR CODE
    }

    public static String decryptCaesarKey(String message, int key) {
        return message;
        // REPLACE THIS WITH YOUR CODE
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Would you like to \"encrypt\" or \"decrypt\" a message?");
        String command = scan.nextLine().trim().toLowerCase();

        if (command.equals("encrypt")) {
            System.out.println("Please enter your message to be encrypted: ");
            String message = scan.nextLine();
            System.out.println("Here is your encrypted message: ");
            System.out.println(encryptCaesar(message));
        }
        else if (command.equals("decrypt")) {
            System.out.println("Please enter your message to be decrypted: ");
            String message = scan.nextLine();
            System.out.println("Here is your decrypted message: ");
            System.out.println(decryptCaesar(message));
        }
        else {
            System.out.println("Unknown command; please type either \"encrypt\" or \"decrypt\"");
        }

        scan.close();
    }
}
