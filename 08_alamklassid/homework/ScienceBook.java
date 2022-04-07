package homework;

public class ScienceBook extends Book{
    String topic;
    int numberOfQuotations;
    String nameOfBook;
    public ScienceBook(String language, int numberOfPages,String topic, int numberOfQuotations, String nameOfBook) {
        super(language, numberOfPages);
        this.topic = topic;
        this.numberOfQuotations = numberOfQuotations;
        this.nameOfBook = nameOfBook;

    }

    @Override
    public void giveInfo() {
        System.out.println("This is a scientific book: " + nameOfBook);
        System.out.println("Language: " + language);
        System.out.println("Number of pages: " + numberOfPages);
        System.out.println("Topic: " + topic);
        System.out.println("Number of quotations: " + numberOfQuotations);
        System.out.println();
    }
}
