package search;

public class User {
    private String username;
    private String password;

    public User(String usernameFromParameter, String passwordFromParameter){
        this.username = usernameFromParameter;
        this.password = passwordFromParameter;
    }

    public String getUsername(){
        return this.username;
    }
}
