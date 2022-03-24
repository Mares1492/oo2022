package kodutoo;

public class Barman extends Person{
    int lvl;
    public Barman(String name, int age, int favoriteDrink,int lvl) {
        super(name, age, favoriteDrink);
        this.lvl = lvl;
    }

    @Override
    public void toDrink(Alco chosenDrink, int barmanLvl) {
        System.out.println("Lvl " + barmanLvl + " Barman drinks " + chosenDrink + " and gains ultimate power!");
    }
}
