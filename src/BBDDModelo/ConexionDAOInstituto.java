package BBDDModelo;

import java.sql.*;

public class ConexionDAOInstituto {                          //El nombre de la BBDD
    private static final String URL = "jdbc:mysql://localhost:3306/?user=root";
    private static final String USER = "root";
    private static final String PASSWORD = "1234";

    private static Connection conectarseABBDD() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}