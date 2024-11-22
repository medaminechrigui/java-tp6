public class WrongLoginException extends Exception{
    public String alert(){
        return "Wrong login attempt";
    }
}
