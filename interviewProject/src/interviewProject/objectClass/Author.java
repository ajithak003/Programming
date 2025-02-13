package interviewProject.objectClass;

public class Author {
	
	private String authorName;
	private int authorId;
	
	public Author(String authorName, int authorId) {
		this.authorId = authorId;
		this.authorName = authorName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getAuthor() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	@Override
	public String toString() {
		return "Author [authorName=" + authorName + ", authorId=" + authorId + "]";
	}
	
	

}
