package Dao;
import Dto.Employee;
public class EmployeeActionProxyImpl implements EmployeeActions{
    EmployeeActions employeeActions;
    public EmployeeActionProxyImpl(){
        employeeActions=new EmployeeActionImpl();
    }
    @Override
    public void create(String clientType, Employee employee) throws Exception {
        if(clientType=="ADMIN") employeeActions.create(clientType, employee);
        else throw new Exception("Access denied");
    }
    @Override
    public void delete(String clientType, int id) throws Exception {
        if(clientType=="ADMIN") employeeActions.delete(clientType, id);
        else throw new Exception("Access denied");
    }
    @Override
    public Employee fetch(String clientType, int id) throws Exception {
        if(clientType=="ADMIN" || clientType=="USER") return employeeActions.fetch(clientType, id);
        else throw new Exception("Access denied");
    }
}
