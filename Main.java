import java.io.IOException;

public class Main {
    static void main(String[] args) {
        try {
            Simple.demo();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
