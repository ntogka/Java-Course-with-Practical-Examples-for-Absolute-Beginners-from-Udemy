package expert.lamda.basics;

public class GuestUserGreater implements Greeter{
    @Override
    public void perform() {
        System.out.println("Welcome to our application. Please create an acount or log in!");
    }
}
