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


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public String getRecordName() {
		return recordName;
	}

	public void setRecordName(String recordName) {
		this.recordName = recordName;
	}

	public int getReleaseDateYear() {
		return releaseDateYear;
	}

	public void setReleaseDateYear(int releaseDateYear) {
		this.releaseDateYear = releaseDateYear;
	}

	public float getSalesMil() {
		return salesMil;
	}

	public void setSalesMil(float salesMil) {
		this.salesMil = salesMil;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Album() { }
}