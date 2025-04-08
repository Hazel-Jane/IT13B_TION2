package Midterms;

import java.io.FileWriter;
import java.io.IOException;

public class File_Handling_Encryption_activity {

    public static void main(String[] args) throws IOException {
        String encryptedMessage;

        try (FileWriter myfile = new FileWriter("C:\\Users\\Cidric Tion\\Desktop\\FileHandling.txt")) {
            int key = 6;
            String message = "I love you! \n Gwapa ko!\n Buotan si Ma'am";
            encryptedMessage = encryptMessage(message, key);
            myfile.write(encryptedMessage);
        }
        System.out.println("Success in writing the file.");
        System.out.println(encryptedMessage);
    }

    public static String encryptMessage(String message, int key) {
        char[] chars = message.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '\n') {
                chars[i] += key;
            }
        }
        return new String(chars);
    }
}
