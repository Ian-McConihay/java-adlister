import java.util.ArrayList;

public class BeanTest {
	public static void main(String[] args) {
		ArrayList<Author> team = new ArrayList<>();
				Author author = new Author();
				author.setId(12);
				author.setFirstName("Ian");
				author.setLastName("McConihay");

				Author author1 = new Author();
				author1.setId(13);
				author1.setFirstName("Bob");
				author1.setLastName("Vance");

				team.add(author);
				team.add(author1);

				for(Author name : team) {
					System.out.println(name.getFirstName());
					System.out.println(name.getLastName());
				}
		System.out.println();

	}
}
