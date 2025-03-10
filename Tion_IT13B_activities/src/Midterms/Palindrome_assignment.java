
import java.util.Scanner;

public class Palindrome_assignment {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a word or phrase:");
        String word = in.nextLine();
        
        StringBuilder reversed = new StringBuilder();
        for (int x = word.length() - 1; x >= 0; x--) {
            reversed.append(word.charAt(x));
        }

        if (word.equals(reversed.toString())) {
            System.out.println("\"" + word.toUpperCase() + "\" is a Palindrome!");
        } else {
            System.out.println("\"" + word.toUpperCase() + "\" is NOT a Palindrome.");
        }

    }
}
