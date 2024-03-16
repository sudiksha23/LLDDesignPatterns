
package Dao;

import Dto.Employee;

public interface EmployeeActions {
    public void create(String clientType, Employee employee) throws Exception;
    public void delete(String clientType, int id) throws Exception;
    public Employee fetch(String clientType, int id) throws Exception;
}
