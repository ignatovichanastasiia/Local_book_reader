package book_reader;

import java.util.List;
import java.util.stream.Collectors;

public class Library {
    private List<Book> books;

    // Constructor and methods for searching books by author or genre
    public List<Book> searchByAuthor(String author) {
        return books.stream().filter(book -> book.getAuthor().equals(author)).collect(Collectors.toList());
    }

    public List<Book> searchByGenre(String genre) {
        return books.stream().filter(book -> book.getGenre().equals(genre)).collect(Collectors.toList());
    }
}
