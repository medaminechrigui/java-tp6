public class TestAuthentification {
    public static void main(String[] args) {
        try{
            Authentification l=new Authentification();
            if(l.getLogin().length()>10 || l.getPassword().length()>10){
                throw new WrongInputLength();
            }
            else if(!(l.getLogin().equalsIgnoreCase(l.getLoginCorrect()))){
                throw new WrongLoginException();
            } else if (!(l.getPassword().equalsIgnoreCase(l.getPwdCorrect()))) {
                throw new WrongPwdException();
            }else{
                System.out.println("Correct login and password ");
            }
        }catch(WrongLoginException e){
            System.out.println(e.alert());
        }catch(WrongPwdException e){
            System.out.println(e.alert());
        }catch (WrongInputLength e){
            System.out.println(e.alert());
        }
    }
}
