import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Person> per30;
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person(30, "Аня"));
        persons.add(new Person(34, "Лена"));
        persons.add(new Person(32, "Женя"));
        persons.add(new Person(12, "Игорь Николаевич"));
        persons.add(new Person(25, "Олег"));
        persons.add(new Person(44, "Сигизмунд"));

        persons.stream().forEach((person) -> System.out.println(person.getName() + ", " + person.getAge() + " лет"));
        System.out.println("Возраст");
        List ages = persons.stream().map((person -> person.getAge())).collect(Collectors.toList());
        ages.stream().forEach(age -> System.out.print(age + " "));
        System.out.println();
        System.out.println("Имена");
        List names = persons.stream().map((person -> person.getName())).collect(Collectors.toList());
        names.stream().forEach(name -> System.out.print(name + " "));
        System.out.println();
        System.out.println("30+:");
        per30 = persons.stream().filter((person -> person.getAge() > 30)).collect(Collectors.toList());
        per30.stream().forEach(p -> System.out.println(p.getName()));
    }
}