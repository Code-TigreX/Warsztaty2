package pl.entity;


import org.mindrot.jbcrypt.BCrypt;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserDAO {
    //                                                          zapytania SQl

    private static final String CREATE_USER =
    "INSERT INTO users(username, email, password) VALUES (?,?,?)";

    private static final String UPDATE_USER_DATA =
    "UPDATE users SET ? = ? WHERE ? = ?";

    private static final String SELECT_ALL_BY_ID =
            "SELECT * FROM users ORDER BY id ASC";

    private static final  String DELETE_USER =
            "DELETE FROM users WHERE email = ?";

    
//                                                              hashowanie
    public String hashPass(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }
}