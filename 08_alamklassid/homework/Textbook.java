package homework;

public class Textbook extends SchoolBook{
    boolean hasBraille;
    public Textbook(String language, int numberOfPages, String subject, int grade,boolean hasBraille) {
        super(language, numberOfPages, subject, grade);
        this.hasBraille = hasBraille;
    }

    @Override
    public void giveInfo() {
        System.out.println("This is a " + subject + " textbook");
        System.out.println("Language: " + language);
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
