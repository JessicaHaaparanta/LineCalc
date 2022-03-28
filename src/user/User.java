package user;

public class User {

   private String userName;
   private String password;

    public User(String myUserName, String myPassword) {
        userName = myUserName;
        password = myPassword;
    }

    public String GetUserName() {
        return userName;
    }

    public void updateUserName(String newUserName) {
        userName =newUserName;

    }


}
