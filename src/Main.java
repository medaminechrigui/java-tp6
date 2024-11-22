
public class Main {
    public static void main(String[] args) {
        boolean ok = false;
        while(ok == false) {
        try{
            Authentification l=new Authentification();
            if(!(l.getLogin().equals(l.getLoginCorrect()))){
                throw new WrongLoginException();
            } else if (!(l.getPassword().equals(l.getPwdCorrect()))) {
                throw new WrongPwdException();
            }else{
                System.out.println("Correct login and password ");
                ok = true;
            }
        }catch (WrongInputLength e){
            System.out.println(e.alert());
        }
        catch(WrongLoginException e){
            System.out.println(e.alert());
        }catch(WrongPwdException e){
            System.out.println(e.alert());
        }
    }}
}
