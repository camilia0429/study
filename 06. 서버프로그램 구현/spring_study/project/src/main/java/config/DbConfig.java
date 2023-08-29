package config;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class DbConfig {

    @Value("${db.class.name}")
    private String driverClassname;
    @Value("${db.Url}")
    private String dbUrl;

    @Value("${db.username}")
    private String userName;

    @Value("${db.password}")
    private String password;
    @Bean(destroyMethod = "close")
    public DataSource dataSource() {
        DataSource ds = new DataSource();
//        ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        ds.setDriverClassName(driverClassname);
//        ds.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
        ds.setUrl(dbUrl);
//        ds.setUsername("BOARD_B1");
        ds.setUsername(userName);
//        ds.setPassword("_aA123456");
        ds.setPassword(password);

        ds.setInitialSize(2);
        ds.setMaxActive(10);
        ds.setTestWhileIdle(true);
        ds.setMinEvictableIdleTimeMillis(1000 * 30);
        ds.setTimeBetweenEvictionRunsMillis(1000 * 3);

        return ds;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(dataSource());
    }
}
