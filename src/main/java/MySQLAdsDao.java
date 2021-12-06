import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.DriverManager;
import com.mysql.cj.jdbc.Driver;

public class MySQLAdsDao implements Ads {
private Connection connection;


			public MySQLAdsDao(Config config) {
				try {
					DriverManager.registerDriver(new Driver());
					this.connection = DriverManager.getConnection(
							config.getUrl(),
							config.getUser(),
							config.getPassword()
					);
				} catch(SQLException throwables){
					throwables.printStackTrace();
				}
			}



//<c: forEach items="${allAds}" var "ad">



	@Override
	public List<Ad> all() throws SQLException {
		String selectQuery = "SELECT * FROM ads";
		List<Ad> adlist = new ArrayList<>();

		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(selectQuery);
			while (resultSet.next()) {

				Ad currentAd = new Ad( resultSet.getLong("id"),
						resultSet.getString("title"),
						resultSet.getString("description"));

				adlist.add(currentAd);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return adlist;
	}

	@Override
	public Long insert(Ad ad) {

		return null;
	}
}
