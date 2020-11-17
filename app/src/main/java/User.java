public class User {

    private String firstname;
    private String surname;
    private String email;
    private String password;
    private String site;

    public User(String fn, String sn, String pwd, String site){
        this.firstname = fn;
        this.surname = sn;
        this.password = pwd;
        this.site = site;

        setEmail();
    }

    private void setEmail(){
        String ext = "@test.com";
        email = firstname + "." + surname + ext;
    }
}
