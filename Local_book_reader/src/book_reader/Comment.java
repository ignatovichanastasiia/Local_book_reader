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

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
    
    
}