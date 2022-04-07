package homework;

public abstract class Book implements BookReader{
    String language;
    int numberOfPages;

    public Book(String language, int numberOfPages) {
        this.language = language;
        this.numberOfPages = numberOfPages;
    }


}
