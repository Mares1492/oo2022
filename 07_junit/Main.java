
public class Main {


    public static void main(String[] args) {

        Girl mary = new Girl("Mary");
        Boy john = new Boy("John");

        mary.changeGender(mary.chooseIfRandomGender(mary.name));
        john.changeGender(mary.chooseIfRandomGender(john.name));
    }


}
