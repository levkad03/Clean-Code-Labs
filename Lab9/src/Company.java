import java.util.List;

public class Company implements Visitable {

    private String name;
    private List<Department> departments;

    public Company(String name, List<Department> departments) {
        this.name = name;
        this.departments = departments;
    }

    public String getName() {
        return name;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (Department department : departments) {
            department.accept(visitor);
        }
    }
}
