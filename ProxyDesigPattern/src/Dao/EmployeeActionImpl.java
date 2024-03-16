package Dao;

import Dto.Employee;

public class EmployeeActionImpl implements EmployeeActions{
    @Override
    public void create(String clientType, Employee employee) throws Exception {
        // add employee into db
        System.out.println("Created new Employee in db");
    }

    @Override
    public void delete(String clientType, int id) throws Exception {
        // delete employee with emp id from db
        System.out.println("Delete employee with id: "+id);
    }

    @Override
    public Employee fetch(String clientType, int id) throws Exception {
        System.out.println("Fetch data with id: "+id+" from db");
        return new Employee("random", id);
    }
}
