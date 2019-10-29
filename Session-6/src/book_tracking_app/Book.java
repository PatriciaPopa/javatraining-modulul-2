package book_tracking_app;

import java.time.LocalDate;

public class Book {
	private String author;
	private String title;
	private int rating;
	private LocalDate currDate;
	private LocalDate returnDate;

	public Book(String author, String title, int rating, LocalDate returnDate) {
		super();
		this.author = author;
		this.title = title;
		this.rating = rating;
		currDate = LocalDate.now();
		this.returnDate = returnDate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public LocalDate getCurrDate() {
		return currDate;
	}

	public void setCurrDate(LocalDate currDate) {
		this.currDate = currDate;
	}

	public LocalDate getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}

	@Override
	public String toString() {
		return "Book [author=" + author + ", title=" + title + ", rating=" + rating + ", currDate=" + currDate
				+ ", returnDate=" + returnDate + "]";
	}

}
