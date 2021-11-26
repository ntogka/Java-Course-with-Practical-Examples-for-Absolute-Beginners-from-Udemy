package expert.lamda.predicate;

import java.util.function.Predicate;

public class LambdaPredicateApp {

    public static void main(String[] args) {

        Predicate<String> moreThan5Letters = text -> text.length() > 5;
        Predicate<String> startWithWelcome = text -> text.startsWith("Welcome");

        boolean isMoreThan5Letters = moreThan5Letters.test("Welcome");
        System.out.println("The text typed in is longer than 5 letters: " + isMoreThan5Letters);

        boolean isStartWithWelcome = startWithWelcome.test("Welcome");
        System.out.println("The text typed in starts with \"Welcome\": " + isStartWithWelcome);

        boolean isLessThan5Letters = moreThan5Letters.negate().test("Welcome");
        System.out.println("The text typed in is sorter than 5 letters:  " + isLessThan5Letters);

        boolean isCombinedAnd = moreThan5Letters.and(startWithWelcome).test("Welcome");
        System.out.println("The text typed in is longer than 5 letters and starts with \"Welcome\": " + isCombinedAnd);

        boolean isCombinedOr = moreThan5Letters.or(startWithWelcome).test("Welcom");
        System.out.println("The text typed in is longer than 5 letters or starts with \"Welcome\": " + isCombinedOr);


    }

}
