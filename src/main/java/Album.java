import java.io.Serializable;

public class Album implements Serializable {
	private long id;
	private String artistName;
	private String recordName;
	private int releaseDateYear;
	private float salesMil;
	private String genre;
//	Primary key
//	Unique artist_name

	public Album() { }
}