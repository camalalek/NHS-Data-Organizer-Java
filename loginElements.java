//Project location is defined here
package NHS;

//Class extends the main class for refrencing
class loginElements extends nhs {

    //Values used for login object
    String user, email, password;

    //Setting default values for object values
    public void loginEntry() {
        user = "";
        email = "";
        password = "";
    }

    //GETTERS AND SETTERS
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
