import javax.jws.soap.SOAPBinding;
import java.util.Comparator;

public class User implements Comparator<User> {
    private String login;
    private String email;
    private String password;
    private String phoneNumber;

    public String getLogin(){return login;}
    public String getEmail(){return email;}

    User(String email,String login){
        this.email=email;
        this.login=login;
    }


    @Override
    public int compare(User o1, User o2) {

        return o1.getLogin().compareTo(o2.getLogin());
    }


    @Override
    public String toString(){
        return "E-mail:"+ email+"\t\tLogin: "+login;
    }
}

