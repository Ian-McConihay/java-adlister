import java.io.Serializable;

public class Quote implements Serializable {
	private long id;
	private String content;
	private int authorId;

		public Quote() { }
}

//		PRIMARY KEY (id),
//	FOREIGN KEY (author_id) REFERENCES authors (id)
