package homework;

public class LanguageLearningTextbook extends Textbook{
    LevelOfLanguage level;

    public LanguageLearningTextbook(String language, int numberOfPages, String subject, int grade, boolean hasBraille,LevelOfLanguage level) {
        super(language, numberOfPages, subject, grade, hasBraille);
        this.level = level;
    }
    @Override
    public void giveInfo() {
        System.out.println("This is an " + language +" "+ level + " textbook");
        System.out.println("Number of pages: " + numberOfPages);
        System.out.println(grade + " grade");
        if (hasBraille){
            System.out.println("Has Braille");
        }else {
            System.out.println("No Braille :(");
        }
        System.out.println();
    }
}
