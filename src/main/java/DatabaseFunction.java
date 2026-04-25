import java.sql.Connection;
import java.sql.*;

public class DatabaseFunction {

    private Connection connection;
    // constructor that connects to DatabaseManager
    public DatabaseFunction(Connection connection) {
        this.connection = connection;
    }

    // ToDo: insertUser(String , String )

    //insert method
    //adding a new user to the database
    public boolean insertUser(String username, String password) {
        String sql = "INSERT INTO users (username, password) VALUES (?, ?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.println("insertUser failed to insert: " + e.getMessage());
            return false;
        }
    }

    //ToDo: getUserByUsername(String )

    //ToDo: updatePassword(String , String )

    //ToDo: deleteUser(String )
}
