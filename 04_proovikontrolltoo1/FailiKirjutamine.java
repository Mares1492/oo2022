import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FailiKirjutamine {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(
                new FileWriter("valjund1.txt")
        );
        pw.println("Teretere");
        pw.print(" Juku");
        pw.print(" Kuku");
        pw.close();
    }
}