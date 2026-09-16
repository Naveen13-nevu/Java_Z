
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


class Employee{
    String name;
    double salary;

    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
}
public class sortSalaryByAscending {
    
    public static void main(String[] args) {
        
        List<Employee> employees = Arrays.asList(
         new Employee("naveen", 10000),
            new Employee("arun", 40000),
            new Employee("diwakar", 30000)
        );

        employees.stream()
        .sorted(Comparator.comparingDouble(e -> e.salary))
        .forEach(e -> System.out.println(e.name + " = "+ e.salary));
        
        // List<Employee> sorting = employees.stream()
        // .sorted(Comparator.comparingDouble(e -> e.salary))
        // .collect(Collectors.toList());

        // sorting.forEach(e -> System.out.println(e.name + " = "+ e.salary));

    }
}
