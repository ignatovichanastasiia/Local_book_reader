package book_reader;

import java.time.LocalDate;

public class Comment {
    private String text;
    private LocalDate date;

    // Constructor and methods to work with comments
    public Comment(String text) {
        this.text = text;
        this.date = LocalDate.now();
    }
}