/**
 * Created by Amberlee on 6/9/17.
 */
public class Config {

    private String user = "root";
    private String password = "codeup";
    private String url = "jdbc:mysql://localhost/adlister_db?serverTimezone=UTC";

    public String getUser() {
        return this.user;
    }

    public String getPassword() {
        return this.password;
    }

    public String getUrl() {
        return this.url;
    }


}
