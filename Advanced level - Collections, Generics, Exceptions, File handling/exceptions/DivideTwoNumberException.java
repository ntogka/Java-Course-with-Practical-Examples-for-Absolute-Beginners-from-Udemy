package advanced.exceptions;

public class DivideTwoNumberException {

    public static void main(String[] args) {

        System.out.println(divide(30,2));
        System.out.println(divide(15,0));
        System.out.println("The job is finished!");

    }

    private static int divide(int dividend, int divisor) {
        try {
            if (divisor == 0 ) {
                throw new ZeroDivisorException("The divisor cant't be zero! - Costom exception");
            }
            return dividend / divisor;
        } catch (NullPointerException exception){
            System.err.println("NullPointerException is throw!");
            return 0;
        } catch (ZeroDivisorException|NumberFormatException exception){
            System.err.println("The divisor can't be zero!");
            exception.printStackTrace(); // for developer
            return 0;
        } finally {
            System.out.println("Hey, I' m a very good tool to close files and database connections.");
        }
    }

}
