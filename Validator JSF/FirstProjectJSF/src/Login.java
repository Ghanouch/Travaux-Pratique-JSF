import javax.faces.bean.ManagedBean;

/**
 * Created by zguindouos on 06/03/17.
 */
@ManagedBean
public class Login {

    private String login;
    private String password;

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String sign_in() {
        if(login.equals("manager") && password.equals("manager")) {
            return "manager";
        }
        return null;
    }
}
