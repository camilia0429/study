package jdbcex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Ex03 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("oracle.jdbc.driver.OracleDriver");

        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        String user = "scott", password = "tiger";

        String sql = "INSERT INTO DEPT2 VALUES(DEPT2_SEQ.nextval,?,?)";
        try(Connection conn = DriverManager.getConnection(url, user, password);
        PreparedStatement pstmt = conn.prepareStatement(sql, new String[] {"DEPTNO"})) {
            conn.setAutoCommit(false); // 트랜젝션의 수동 관리

            pstmt.setString(1,"부서3");
            pstmt.setString(2,"인천");

            int affctedRows = pstmt.executeUpdate();
            if(affctedRows > 0){
                ResultSet rs = pstmt.getGeneratedKeys();
                if(rs.next()) {
                    int DEPTNO = rs.getInt(1);
                    System.out.println(DEPTNO);
                }
            }
            System.out.println(affctedRows);

        } catch(Exception e) {
            e.printStackTrace();
        }

    }
}
