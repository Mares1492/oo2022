import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public interface Interface {

    Gender changeGender(int GetRandomGender);

    Gender genderPicker(int chosenGender);

    List<Gender> genderList = new ArrayList<>(Arrays.asList(Gender.values()));


    default int random() {
        int max = 5;
        int min = 1;
        int range = max - min + 1;
        return (int)(Math.random() * range) + min;
    }

    default void printGenderList(){
        System.out.println("Variants for gender change: ");
        System.out.println(Arrays.toString(genderList.toArray()));
    }
    default int chooseIfRandomGender(String name) {
        Scanner input = new Scanner(System.in);
        int randomGender = 5;
        System.out.println("You`re about to change gender of " + name);
        System.out.println("Choose if you want a random gender or not: ");
        System.out.println("0. I want to choose the new gender");
        System.out.println("1. I want to get a random gender ");
        while(randomGender > 1 || randomGender < 0) {
            randomGender = input.nextInt();
        }
        return randomGender;
    }

}
