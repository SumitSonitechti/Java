package Exception;
public class MyException {
    public static void main(String[] args){
        UserDefineException obj = new UserDefineException();
        try {
            obj.validate(12);
        }catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
