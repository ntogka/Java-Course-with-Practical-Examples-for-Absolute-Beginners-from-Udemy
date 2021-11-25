package advanced.stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerApp {

    public static void main(String[] args) {

        String starWarsQuotes = "May,the,force,be,with,you!";

        System.out.println("We are using StringTokenizer here:");
        StringTokenizer stringTokenizer = new StringTokenizer(starWarsQuotes, ","/*, true*/);
        System.out.println("Number of tokens: " + stringTokenizer.countTokens());
        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        }

        System.out.println("We are using String's split function here: ");
        String[] starWarsQuoteWords = starWarsQuotes.split(",", 3);
        System.out.println("Number of elements: " + starWarsQuotes.length());
        for (String starWarsQuoteWord : starWarsQuoteWords ) {
            System.out.println(starWarsQuoteWord);
        }

    }

}
