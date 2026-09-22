package OOPS.task.encapsulation;

import java.util.*;

public class UserAccount {

    public static void main(String[] args) {
        UserAccount A = new UserAccount("Mohamed saif", "moha@gamil.com", "user1234");
        System.out.println(A.getUsername());
        System.out.println(A.getEmail());
        A.login("232");
        A.login("232");
        A.login("232");
        A.resetpassword("u232", "MOh2124");
        A.login("Moh2124");
    }

    private String Username;
    private String Password;
    private String Email;
    private int loginAttempts;

   
    public UserAccount(String username, String email, String password) {
        this.Username = username;
        this.Email = email;
        this.Password = password;
        this.loginAttempts = 0; 
    }

    public String getUsername() {
        return this.Username;
    }

    public String getEmail() {
        return this.Email;
    }

    public void login(String password) {
        if (loginAttempts >= 3) {
            System.out.println("Cant login");
            return;
        } else {
            if (this.Password.equals(password)) {
                System.out.println("Login Successful");
                return;
            } else {
                loginAttempts++;
                System.out.println("Invalid Password");
                if (loginAttempts == 3) {
                    System.out.println("Account Locked");
                    return;
                }
            }
        }
    }

    public void resetpassword(String oldPas, String newpas) {
        if (this.Password.equals(oldPas)) {
            this.Password = newpas;
            System.out.println("Password reset successfully");
            return;
        } else {
            System.out.println("Invalid Password");
        }
    } 
}  

