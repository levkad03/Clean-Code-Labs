import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Developer", 1000);
        Employee employee2 = new Employee("Designer", 1200);

        Department department = new Department("IT Department", List.of(employee1, employee2));
        Company company = new Company("Tech Corp", List.of(department));

        SalaryReportVisitor salaryReportVisitor = new SalaryReportVisitor();

        company.accept(salaryReportVisitor);

        department.accept(salaryReportVisitor);
    }
}