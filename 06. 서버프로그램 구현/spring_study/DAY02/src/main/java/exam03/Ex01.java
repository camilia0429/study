package exam03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex01 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("oracle.jdbc.driver.OracleDriver");

        String url = "jdbc:oracle:thin:@localhost:1521:orcl?user=BOARD_B1&password=_aA123456";

        try(Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement()) {
            String sql = "INSERT INTO BOARD_DATA (id, poster, subject, content) " +
                        "VALUES (BOARD_DATA_SEQ.nextval, '작성자', '제목3','내용3')";

            int affectedRows = stmt.executeUpdate(sql);
            System.out.println(affectedRows);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
