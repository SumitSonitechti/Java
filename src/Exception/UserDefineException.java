package Exception;

public class UserDefineException {
    public void validate(int age)throws InvalidAgeException {
        if(age<18) {
            throw new InvalidAgeException("Not Eligible to Vote");
        }
        else{
            System.out.println("Eligible to Vote");
        }
    }
}
