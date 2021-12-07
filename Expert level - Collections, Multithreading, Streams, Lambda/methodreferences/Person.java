package expert.methodreferences;

public class Person implements Comparable{

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override //(constructor method reference)
    public int compareTo(Object o) {
        Person person = (Person) o;
        return this.getAge().compareTo(person.getAge());
    }
}
