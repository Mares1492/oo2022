package homework;

public class Workbook extends SchoolBook{
    boolean hasKey;

    public Workbook(String language, int numberOfPages, String subject, int grade, boolean hasKey) {
        super(language, numberOfPages, subject, grade);
        this.hasKey = hasKey;
    }

    @Override
    public void giveInfo() {
        System.out.println("This is a " + subject + " workbook");
        System.out.println("Language: " + language);
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
