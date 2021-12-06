import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {
private Connection connection;
private Config config = new Config();

			public MySQLAdsDao() throws SQLException { //new Driver();
				this.connection = DriverManager.getConnection(
						config.getUrl(),
						config.getUser(),
						config.getPassword()
				);
			}



//<c: forEach items="${allAds}" var "ad">



	@Override
	public List<Ad> all() throws SQLException {
		String selectQuery = "SELECT * FROM albums";
		Statement statement = null;
		ResultSet resultSet = null;
		List<Ad> adlist = new ArrayList<>();
		resultSet = statement.executeQuery(selectQuery);

		while (resultSet.next()) {
			System.out.println("Here's an ad:");
			System.out.println("  id: " + resultSet.getLong("id"));
			System.out.println("  title: " + resultSet.getString("title"));
			System.out.println("  description: " + resultSet.getString("description"));
		}
		return null;
	}

	@Override
	public Long insert(Ad ad) {
		return null;
	}
}
