package kodutoo;


public class Main {
    public static void main(String[] args) {
        System.out.println("Three programmers walk into a bar...");
        Programmer friendW = new Programmer("Willy",39,1,2); // 1. Whiskey
        Programmer friendR = new Programmer("Roland",25,3,6); //  2. Vodka
        Programmer friendV = new Programmer("Vladimir",32,2,4); //  3. Rum
        Barman barman = new Barman("Teddy", 38, 1,10);

        while (
                (friendW.checkStatus()) &&
                (friendR.checkStatus()) &&
                (friendV.checkStatus())
        ) {
            if (friendW.checkStatus()) {
                friendW.printStaatus();
                friendW.toDrink(barman.suggest(friendW), barman.lvl);
            }
            if (friendR.checkStatus()) {
                friendR.printStaatus();
                friendR.toDrink(barman.suggest(friendR), barman.lvl);
            }
            if (friendV.checkStatus()) {
                friendV.printStaatus();
                friendV.toDrink(barman.suggest(friendV), barman.lvl);
            }
        }

        barman.toDrink(Alco.GIN, barman.lvl);

    }
}
