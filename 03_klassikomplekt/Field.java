
public class Field { //Settings
    int height = 11;
    int width = 60;
    char[][] field = new char[width][height]; //Panin neid siia mugavuse pärast. Nüüd ei pea parameetrid edasi-tagasi saatma
    Batter batter = new Batter(40, 40); // ↓
    Ball ball1 = new Ball(25, 4, batter.strength, batter.technique, width, height); // ↓
    Ball ball2 = new Ball(16, 8, batter.strength, batter.technique, width, height); // ↓
    Ball ball3 = new Ball(30, 2, batter.strength, batter.technique, width, height); // ↓

    public Field() {
        char symbol;
        int base = width - 3;
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if ((y == 0 || y == height - 1) ||  (y == (height/2 - 1) && (x > 0 && x <= 5)) || (y == (height/2 + 1) && (x > 0 && x <= 5))) {
                    symbol = '-';
                } else if (x == 0 || x == width - 1) {
                    symbol = '|';
                } else if (y == (height/2) && x == base) {
                    symbol = '$';
                } else if (y == (height/2) && x == 1) {
                    symbol = '>';
                } else if
                ((y == ball1.coordinateY && x == ball1.coordinateX)
                                || (y == ball2.coordinateY && x == ball2.coordinateX)
                                || (y == ball3.coordinateY && x == ball3.coordinateX))
                {
                    symbol = '*';
                } else {
                    symbol = ' ';
                }
                field[x][y] = symbol;
            }
        }
    }

    public void CallField() {
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if (field[x][y] == '*'){
                    if (y == ball1.coordinateY && x == ball1.coordinateX) {
                        field[x + 1][y] = '1';
                    }
                    if (y == ball2.coordinateY && x == ball2.coordinateX) {
                        field[x + 1][y] = '2';
                    }
                    if (y == ball3.coordinateY && x == ball3.coordinateX) {
                        field[x + 1][y] = '3';
                    }
                }
                System.out.print(field[x][y]);
            }
            System.out.println();
        }
    }
}