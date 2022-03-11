import java.util.Scanner;

public class TripsTrapstTrull {
    static char[][] field = new char[5][5];
    public static void main(String[] args) {
        for (int y = 0; y < 5; y++) {
            for (int x = 0; x < 5; x++) {
                if ((y == 1 || y == 3) && (x == 0 || x == 2 || x == 4)){
                    field[y][x] = '—';
                }else if( x == 1 || x == 3){
                    field[y][x] = '|';

                }else {
                    field[y][x] = ' ';
                }
            }
        }
        printField();
        System.out.print(game());
    }

    public static void printField(){
        for (int y = 0; y < 5; y++) {
            for (int x = 0; x < 5; x++) {
                System.out.print(field[y][x]);
            }
            System.out.println();
        }
    }
    public static String game(){
        Scanner input = new Scanner(System.in);
        System.out.println("First turn → Go Go X");
        int userX = 1;
        int userY = 1;
        for (int i = 0; i < 9; i++) {
            boolean circle = false;
            while (!circle) {
                System.out.println("x: ");
                userX = input.nextInt();
                System.out.println("y: ");
                userY = input.nextInt();
                if ((userX < 0 || userX > 5) || (userY < 0 || userY > 5)) {
                    System.out.println("Please enter valid coordinates");
                }else if ((field[userY][userX] != ' ')) {
                    System.out.println("Please enter valid coordinates");
                }else {
                    circle = true;
                }

            }
            if (i == 0 ||i == 2 || i == 4|| i == 6|| i == 8) {
                System.out.println("O turn ↓");
                field[userY][userX] = 'X';
            }else {
                System.out.println("X turn ↓");
                field[userY][userX] = 'O';
            }
            printField();
            char winner = checkWinner();
            if (winner == 'x'){
                return "X has Won";
            }else if(winner == 'o'){
                return "Y has Won";
            }

        }
        return "Draw, Friendship won";
    }

    public static char checkWinner(){
        if(
            (field[0][0] == 'x' && field[0][2] == 'x' && field[0][4] == 'x') ||
            (field[2][0] == 'x' && field[2][2] == 'x' && field[2][4] == 'x') ||
            (field[4][0] == 'x' && field[4][2] == 'x' && field[4][4] == 'x') ||
            (field[0][0] == 'x' && field[2][0] == 'x' && field[4][0] == 'x') ||
            (field[0][2] == 'x' && field[2][2] == 'x' && field[4][2] == 'x') ||
            (field[0][4] == 'x' && field[2][4] == 'x' && field[4][4] == 'x') ||
            (field[0][0] == 'x' && field[2][2] == 'x' && field[4][4] == 'x') ||
            (field[4][4] == 'x' && field[2][2] == 'x' && field[4][0] == 'x')){
            return 'x';
        }else if(
                (field[0][0] == 'o' && field[0][2] == 'o' && field[0][4] == 'o') ||
                (field[2][0] == 'o' && field[2][2] == 'o' && field[2][4] == 'o') ||
                (field[4][0] == 'o' && field[4][2] == 'o' && field[4][4] == 'o') ||
                (field[0][0] == 'o' && field[2][0] == 'o' && field[4][0] == 'o') ||
                (field[0][2] == 'o' && field[2][2] == 'o' && field[4][2] == 'o') ||
                (field[0][4] == 'o' && field[2][4] == 'o' && field[4][4] == 'o') ||
                (field[0][0] == 'o' && field[2][2] == 'o' && field[4][4] == 'o') ||
                (field[4][4] == 'o' && field[2][2] == 'o' && field[4][0] == 'o')){
            return 'o';
        }
        else {
            return ' ';
        }
    }


}

