import Dao.EmployeeActionImpl;
import Dao.EmployeeActionProxyImpl;
import Dao.EmployeeActions;
import Dto.Employee;

public class Main {
    public static void main(String[] args) {
        try {
            EmployeeActions employeeActions=new EmployeeActionProxyImpl();
            employeeActions.create("USER", new Employee("Sudi", 753));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            EmployeeActions employeeActions=new EmployeeActionProxyImpl();
            employeeActions.create("ADMIN", new Employee("Trivedi", 1));
            employeeActions.fetch("USER", 2);
            employeeActions.delete("EXTERNAL", 2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}