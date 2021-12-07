package expert.methodreferences;

import java.util.*;

public class MethodReferenceApp {

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Steve", 40),
                new Person("Brit", 22),
                new Person("Adam", 27),
                new Person("Anna", 32),
                new Person("Kumar", 91),
                new Person("Anna", 4),
                new Person("Anna", 12));

        /*
            people.stream()
                .sorted(Comparator.comparing(Person::getAge)) //.sorted((person1, person2) -> person1.getAge().compareTo(person2.getAge())) THE SAME
                .forEach(System.out::println);
                //instance method reference of a certain class
        */

        /*
        PersonComparisonProvider comparisonProvider = new PersonComparisonProvider();
        people.stream()
                .sorted(comparisonProvider::compareByNameAndAge)
                .forEach(System.out::println);
        //(instance method reference of an object)
        */


        people.stream()
                .sorted(PersonComparisonProvider::compareByNameAndAge)
                .forEach(System.out::println);
        //static method reference

        List<Integer> numbers = List.of(12,23,45,45,67,12,34,87,102);
        Set<Integer> numbersSet = CollectionTransformer.transform(numbers, HashSet::new);
        System.out.println(numbersSet); //den exei diplotipa

        Set<Person> personSet = CollectionTransformer.transform(people, TreeSet::new);
        System.out.println(personSet);
        //(constructor method reference)
    }

}
