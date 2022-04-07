package homework;

public class LanguageLearningWorkbook extends Workbook {
    LevelOfLanguage level;

    public LanguageLearningWorkbook(String language, int numberOfPages, String subject, int grade, boolean hasKey,LevelOfLanguage level) {
        super(language, numberOfPages, subject, grade, hasKey);
        this.level = level;
    }
    @Override
    public void giveInfo() {
        System.out.println("This is an " + language +" "+ level + " workbook");
        System.out.println("Number of pages: " + numberOfPages);
        System.out.println(grade + " grade");
        if (hasKey){
            System.out.println("Has Key included");
        }else {
            System.out.println("No Key included");
        }
        System.out.println();
    }
}
