import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Human implements Interface{
    Gender gender;
    String name;


    public Human(String name){
        this.name = name;
        List<Gender> genderList = new ArrayList<>(Arrays.asList(Gender.values()));


    }
}
