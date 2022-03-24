package kodutoo;

public class Programmer extends Person{
    int maxDrinks;
    int drinksDone = 0;
    int intoxication;
    public Programmer(String name, int age, int favoriteDrink, int maxDrinks) {
        super(name, age, favoriteDrink);
        this.maxDrinks = maxDrinks;
        this.intoxication = 0;


    }
    public void printStaatus() {
        System.out.println(name);
        System.out.println("Intoxication lvl: " +  intoxication);
        System.out.println("Took " + drinksDone + " out of " + maxDrinks);
        System.out.println();
    }
    public boolean checkStatus() {

        if (intoxication == 100 || maxDrinks == drinksDone) {
            return false;
        }else{
            return true;
        }
    }

    @Override
    public void toDrink(Alco chosenDrink, int barmanLvl) {
        System.out.println("*"+ name + " drinks*");
        if (favoriteDrink == chosenDrink){
            System.out.println(name + ": " + "Good " + chosenDrink + "!");
            intoxication += 10 + barmanLvl;
        }else {
            System.out.println("Meh, not my favorite");
            intoxication += 20 + (barmanLvl * 2);
        }
        drinksDone +=1;
        System.out.println("--------------");
    }
}
