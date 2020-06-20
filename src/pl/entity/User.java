package pl.entity;

public class User {
    
    private int id;
    private String email;
    private String user;
    private String password;
//                                                       Settery
    public void setEmail(String email) {
        this.email = email;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    //                                                   Settery + chaining

//         Wywolanie motody w innej klasie:
//  User user1 = new User()
//  user1.setEmailChain().setUserChain().setPasswordChain();
    public User setEmailChain(String email) {
        this.email = email;
        return this;
    }
    public User setUserChain(String user) {
        this.user = user;
        return this;
    }
    public User setPasswordChain(String password) {
        this.password = password;
        return this;
    }
    //                                                   Gettery
    public String getEmail() {
        return email;
    }
    public String getUser(){
        return user;
 }
    public String getPassword(){
        return password;
 }
}