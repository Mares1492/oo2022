import java.io.*;


public class KirjalikKorrutamine {
    public static void main(String[] args) throws IOException {
        BufferedReader file = new BufferedReader(
                new FileReader("arvud.txt")
        );
        String rida = file.readLine();
        String[] StrNumbers = rida.split(" ",2);
        int [] IntNumbers = new int [2];
        for (int i = 0; i < 2; i++) {
            IntNumbers[i] = Integer.parseInt(StrNumbers[i]);
        }
       int answer = IntNumbers[0] * IntNumbers[1];
        System.out.println(IntNumbers[0] + " * " + IntNumbers[1] + " = " + answer);

    }
}
