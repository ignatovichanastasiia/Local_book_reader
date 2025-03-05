package book_reader;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private String author;
    private String genre;
    private String description;
    private int totalPages;
    private int currentPage;
    private List<String> comments;

    // Constructor and methods to work with the book
    public Book(String title, String author, String genre, String description, int totalPages) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.description = description;
        this.totalPages = totalPages;
        this.comments = new ArrayList<>();
        this.currentPage = 1; // Start from the first page
    }
}

    // Methods to add comments, navigate between pages, etc.
