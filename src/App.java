/**
 * Created by jc243482 on 9/03/15.
 */

/**
 * Text viewer App - prints the contents of a string to the console
 * Created by James Baker on 9/03/15
 */
public class App {
    public static void main(String[] args) {
        String text = "this is a simple test\nOne Two Three\nHello World!";
        for (int i = 0; i < text.length(); ++i) {
            System.out.print(text.charAt(i));
        }
    }
}

