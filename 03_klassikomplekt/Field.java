public class Field {
    public static void main(String[] args) {
        int height = 5;
        int width = 10;
        char symbol;
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if (y == 0 || y == height - 1) {
                    symbol = '-';
                } else if (x == 0 || x == width - 1) {
                    symbol = '|';
                } else {
                    symbol = ' ';
                }
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}