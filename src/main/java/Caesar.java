import java.util.Scanner;
public class Caesar {
    public static String encryptCaesar(String message) {
        int len = message.length();
        String str2 = ""; 
        for (int i = 0; i < len; i++) {
            char ch = message.charAt(i);
            if ( (65 <= ch) && (ch <= 90) ) {
                int diff = ch - 62;
                if ( (diff > 25) && (diff <= 28) ) {
                    diff = diff % 26;
                }
                int diff2 = diff + 65;
                ch = (char) (diff2);
                str2 += ch;
            }
            else if ( ( 97 <= ch) && (ch <= 122) ) {
                int diff = ch - 94;
                if ( (diff > 25) && (diff <= 28) ) {
                    diff = diff % 26;
                }
                int diff4 = diff + 97;
                ch = (char) (diff4);
                str2 += ch;

        }
            else {
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
                int diff = ch - 97;
                if ( (diff > -1) && (diff < 3) ) {
                    diff = diff + 26;
            }
                diff = diff + 94;
                ch = (char) (diff);
                str2 += ch;
        }

             else if ( (65 <= ch) && (ch <= 122) ) {
                int diff = ch - 65;
                if ( (diff > -1) && (diff < 3)) {
                    diff = diff + 26;
                }
                diff = diff + 62;
                ch = (char) (diff);
                str2 += ch;
            }
            else {
                str2 += ch;
            }

        }
       return str2;
    }

    public static String encryptCaesarKey(String message, int key) {
       int len = message.length();
        String str2 = ""; 
        for (int i = 0; i < len; i++) {
            char ch = message.charAt(i);
            if ( (65 <= ch) && (ch <= 90) ) {
                int diff = ch - (65 - key);
                if ( (diff > 25) && (diff <= (25 + key)) ) {
                    diff = diff % 26;
                }
                int diff2 = diff + 65;
                ch = (char) (diff2);
                str2 += ch;
            }
            else if ( ( 97 <= ch) && (ch <= 122) ) {
                int diff = ch - (97 - key);
                if ( (diff > 25) && (diff <= (25 + key)) ) {
                    diff = diff % 26;
                }
                int diff4 = diff + 97;
                ch = (char) (diff4);
                str2 += ch;

        }
            else {
                str2 += ch;

        }

        }
        return str2;
    }

    public static String decryptCaesarKey(String message, int key) {
        int len = message.length();
        String str2 = "";
        int key2 = key % 26;
        for (int i = 0; i < len; i++) {
            char ch = message.charAt(i);
            if ( (97 <= ch) && (ch <= 122) ) {
                int diff = ch - 97;
                if ( (diff > -1) && (diff < key2) ) {
                    diff = diff + 26;
            }
                diff = diff + (97 - key2);
                ch = (char) (diff);
                str2 += ch;
        }

             else if ( (65 <= ch) && (ch <= 122) ) {
                int diff = ch - 65;
                if ( (diff > -1) && (diff < key2)) {
                    diff = diff + 26;
                }
                diff = diff + (65 - key2);
                ch = (char) (diff);
                str2 += ch;
            }
            else {
                str2 += ch;
            }

        }
       return str2;
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
