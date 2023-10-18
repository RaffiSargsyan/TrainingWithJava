package lessons.lesson17;

import java.io.Serializable;

/**
 * This is my class
 */
public class User implements Cloneable, Serializable {
    private static final long serialVersionUID = 6529685198267757690L;
    public String login;
    public transient String password;
    public String email;

    public User(String login, String email, String password) {
        this.login = login;
        this.email = email;
        this.password = password;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}