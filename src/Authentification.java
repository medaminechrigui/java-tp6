import java.util.Scanner;
public class Authentification {
    private final String LoginCorrect="scott";
    private final String PwdCorrect="tiger";
    private String login;
    private String password;
    public Authentification() throws WrongInputLength {
        this.login=getUserLogin();
        this.password=getUserPwd();
    }
    public String getUserLogin() throws WrongInputLength{
        String ch ;
        System.out.println("entre le Login");
        Scanner scan=new Scanner(System.in);
        ch=scan.nextLine();
        if(ch.length()>10 ){
            throw new WrongInputLength();
        }
        return ch;
    }
    public String getUserPwd() throws WrongInputLength{
        String ch ;
        System.out.println("entre le Password");
        Scanner scan=new Scanner(System.in);
        ch=scan.nextLine();
        if(ch.length()>10 ){
            throw new WrongInputLength();
        }
        return ch;
    }

    public String getLoginCorrect() {
        return LoginCorrect;
    }

    public String getPwdCorrect() {
        return PwdCorrect;
    }

    public String getPassword() {
        return password;
    }

    public String getLogin() {
        return login;
    }
}
