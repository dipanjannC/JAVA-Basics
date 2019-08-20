
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class FilterStreamobjects{
  public static void main(String[] argv){
    List<Person> persons = Arrays.asList(new Person("Joe", 12), new Person("Jim", 34), new Person("John", 23));

    Stream<Person> personsOver18 = persons.stream().filter(p -> p.getAge() > 18);
    personsOver18.forEach(p -> System.out.println(p.getFirstName()));

  }
}

class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName) {
        this.firstName = firstName;
    }

    public Person(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
      return "Person [firstName=" + firstName + ", lastName=" + lastName
          + ", age=" + age + "]";
    }
    
}
