import java.util.Scanner;

public class Boy extends Human {

    public Boy(String name) {
        super(name);
        this.gender = Gender.MALE;
    }


    @Override
    public Gender changeGender(int GetRandomGender) {
        Gender oldGender = gender;
        if (GetRandomGender == 1) {
            while (gender == Gender.MALE) {
                gender = (Gender) genderList.toArray()[random()];
            }
        }else{
            System.out.println("Choose gender from the list: ");
            printGenderList();
            Scanner input = new Scanner(System.in);
            int chosenGender = 8;
            while (chosenGender > 6 || chosenGender < 1){
                chosenGender = input.nextInt();
            }
            genderPicker(chosenGender);
        }
        if (gender == oldGender) {
            System.out.println(name + " stays with his old: " + gender);
        }else {
            System.out.println(name + " gets new gender: " + gender);
        }
        return gender;
    }

    public Gender genderPicker(int chosenGender) {
        switch (chosenGender) {
            case 1 -> gender = Gender.MALE;
            case 2 -> gender = Gender.FEMALE;
            case 3 -> gender = Gender.OTHER;
            case 4 -> gender = Gender.AGS;
            case 5 -> gender = Gender.BSBC;
            case 6 -> gender = Gender.BTS;
        }
        return gender;
    }


}
