package kodutoo;

public abstract class Person implements Liquor {
    String name;
    int age;
    Alco favoriteDrink;

    public Person(String name, int age, int favoriteDrink) {
        this.name = name;
        this.age = age;
        this.favoriteDrink = chooseFavorite(favoriteDrink);

        }
    }

