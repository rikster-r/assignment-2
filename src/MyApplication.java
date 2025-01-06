import java.util.ArrayList;
import java.util.Collections;

public class MyApplication {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John", "Lennon", "Manager", 200000.00);
        Employee emp2 = new Employee("Paul", "McCartney", "Developer", 150000.00);
        Student student1 = new Student("George", "Harrison", 3.5);
        Student student2 = new Student("Ringo", "Starr", 2.5);
        Student student3 = new Student("Yoko", "Ono", 2.8);

        ArrayList<Person> people = new ArrayList<>();
        people.add(emp1);
        people.add(emp2);
        people.add(student1);
        people.add(student2);
        people.add(student3);

        Collections.sort(people);

        printData(people);
    }

    public static void printData(Iterable<? extends Payable> payables) {
        for (Payable payable : payables) {
            System.out.println(payable.toString() + " earns " + payable.getPaymentAmount() + " tenge");
        }
    }
}