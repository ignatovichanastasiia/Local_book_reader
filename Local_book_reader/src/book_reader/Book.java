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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public List<String> getComments() {
		return comments;
	}

	public void setComments(List<String> comments) {
		this.comments = comments;
	}
    
    
}

    // Methods to add comments, navigate between pages, etc.
