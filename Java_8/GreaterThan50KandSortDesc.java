import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
    public String name;
    public double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }


    public void setName(String name ){
        this.name = name;
    }

     public void setSalary(double salary ){
        this.salary = salary;
    }

    public String getName(){

        return name;
    }
    public double getSalary(){
        return salary;
    }
    @Override
public String toString(){
    return name + " - " + salary ;
    
}

}

public class GreaterThan50KandSortDesc{
    public static void main(String[] args) {
        
         List<Employee> employees = Arrays.asList(
            new Employee("Naveen", 45000),
            new Employee("Praveen", 75000),
            new Employee("Arun", 60000),
            new Employee("Kumar", 90000),
            new Employee("Ravi", 35000)
    
        );

        List<Employee> list = employees.stream()
        .filter(e -> e.salary > 50000)
        .sorted( Comparator.comparingDouble((Employee e )-> e.salary).reversed())
        .collect(Collectors.toList());

        list.forEach(System.out::println);


    }
}