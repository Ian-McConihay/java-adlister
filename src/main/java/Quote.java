import java.io.Serializable;

public class Quote implements Serializable {
	private long id;
	private String content;
	private int authorId;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public Quote() { }
}

//		PRIMARY KEY (id),
//	FOREIGN KEY (author_id) REFERENCES authors (id)
