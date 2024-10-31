import java.util.List;

public class Department implements Visitable {

    private String name;
    private List<Employee> employees;

    public Department(String name, List<Employee> employees) {
        this.name = name;
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
