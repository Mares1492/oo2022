
public class Main {


    public static void main(String[] args) {

        Girl mary = new Girl("Mary");
        Boy john = new Boy("John");

        mary.changeGender(mary.chooseRandomGender(mary.name));
        john.changeGender(mary.chooseRandomGender(john.name));
    }


}
