package homework;

public class FictionBook extends Book{
    String genre;
    int rating;
    String author;
    String nameOfBook;
    public FictionBook(String language, int numberOfPages, String genre,int rating, String author,String nameOfBook) {
        super(language, numberOfPages);
        this.genre = genre;
        this.rating = rating;
        this.author = author;
        this.nameOfBook = nameOfBook;


    }

    @Override
    public void giveInfo() {
        System.out.println("This is a fiction book");
        System.out.println("Name of the book: " + '"' + nameOfBook + '"');
        System.out.println("Language: " + language);
        System.out.println("Number of pages: " + numberOfPages);
        System.out.println("Genre: " + genre);
        System.out.println("Rating: " + rating + " out of 10");
        System.out.println();
    }


}
