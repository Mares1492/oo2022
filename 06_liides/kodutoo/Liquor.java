package kodutoo;

import java.util.Scanner;

public interface Liquor {

    void toDrink(Alco chosenDrink, int barmanLvl);

    default Alco suggest(Programmer person){
        Alco barmanSuggestion = alcoList();
        System.out.println(person.name + " would you like " + barmanSuggestion +" ?");
        if (barmanSuggestion == person.favoriteDrink){
            System.out.println(person.name + ": Nice! That's my favorite");
        }
        else {
            System.out.println(person.name + ": Ok...");
        }
        return barmanSuggestion;
    }


    default Alco chooseFavorite(int favoriteDrink) {
        if (favoriteDrink == 1) {
            return Alco.WHISKEY;

        } else if (favoriteDrink == 2) {
            return Alco.VODKA;

        } else {
            return Alco.RUM;
        }
    }
    default Alco alcoList() {
        int barmanSuggestion = -1;
        System.out.println("Choose suggestion: ");
        System.out.println("1. Whiskey");
        System.out.println("2. Vodka");
        System.out.println("3. Rum");

        Scanner input = new Scanner(System.in);

        while (barmanSuggestion < 1 || barmanSuggestion > 3 ){
            barmanSuggestion = input.nextInt();
        }
        return chooseFavorite(barmanSuggestion);
    }
}


