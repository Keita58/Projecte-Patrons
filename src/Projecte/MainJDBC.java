package Projecte;

import java.sql.*;

public class MainJDBC {

    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            conn =
                    DriverManager.getConnection("jdbc:mysql://localhost/pokemon?" +
                            "user=root&password=super3");
            st = conn.createStatement();
            rs = st.executeQuery("SELECT * FROM pokemon");
            // or alternatively, if you don't know ahead of time that
            // the query will be a SELECT...
		 /*if (stmt.execute("SELECT * FROM pokemon")) {
		 rs = stmt.getResultSet();
		 }*/

            while(rs.next()){
                //Display values
                System.out.println("ID: " + rs.getInt("idPokemon"));
                System.out.println("Name: " + rs.getString("name"));

            }
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        finally {

            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException sqlEx) { } // ignore
                rs = null;
            }
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException sqlEx) { } // ignore
                st = null;
            }
        }
    }
}

