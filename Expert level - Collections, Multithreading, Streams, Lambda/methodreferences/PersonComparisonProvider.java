package expert.methodreferences;

import java.util.Comparator;

public class PersonComparisonProvider {
    //static method reference
    public static int compareByNameAndAge(Person person1, Person person2) {
        return Comparator.comparing(Person::getName)
                .thenComparing(Person::getAge)
                .compare(person1, person2);


    /*  (instance method reference of an object)
    public int compareByNameAndAge(Person person1, Person person2) {
        return Comparator.comparing(Person::getName)
                .thenComparing(Person::getAge)
                .compare(person1, person2);

    */
    }
}
