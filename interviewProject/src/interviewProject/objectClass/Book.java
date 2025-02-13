package interviewProject.objectClass;

import java.util.List;

public class Book {

	private int bookId;
	private String bookName;
	private List<String> authornames;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public List<String> getAuthorName() {
		return authornames;
	}
	public void setAuthorName(List<String> authornames) {
		this.authornames = authornames;
	}
	public Book(int bookId, String bookName, List<String> authornames) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.authornames = authornames;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", authornamess=" + authornames + "]";
	}
	
	
	
	
}
