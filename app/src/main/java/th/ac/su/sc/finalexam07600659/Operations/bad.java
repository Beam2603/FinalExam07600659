package th.ac.su.sc.finalexam07600659.Operations;

public class bad   implements Operation{
    @Override
    public boolean login(String name, String pass) {
        if(name.length()==0  && pass.length()==0){
            return true;
        }
        return false;
    }


    @Override
    public String ans() {
        return "Invalid username or password";
    }
}
