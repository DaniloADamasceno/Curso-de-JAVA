import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FinallyMet {

    public static void main(String[] args) throws Exception {

        File file = new File("C:\\tempi \\in. txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error opening file: | Erro ao abrir arquivo: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();

            }
        }

    }
}

