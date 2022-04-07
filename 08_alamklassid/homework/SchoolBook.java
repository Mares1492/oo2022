package homework;

public class SchoolBook extends Book {
    String subject;
    int grade;
    public SchoolBook(String language, int numberOfPages, String subject, int grade) {
        super(language, numberOfPages);
        this.subject = subject;
        this.grade = grade;
    }

    @Override
    public void giveInfo() {
        System.out.println("This is a school book on " + subject);
        System.out.println("Language: " + language);
        System.out.println("Number of pages: " + numberOfPages);
        System.out.println(grade + " grade");
        System.out.println();
    }
}
