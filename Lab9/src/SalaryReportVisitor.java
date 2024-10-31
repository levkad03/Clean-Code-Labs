public class SalaryReportVisitor implements Visitor {
    @Override
    public void visit(Company company) {
        System.out.println("Salary report for company: " + company.getName());
    }

    @Override
    public void visit(Department department) {
        System.out.println("Salary report for department: " + department.getName());
    }
}
