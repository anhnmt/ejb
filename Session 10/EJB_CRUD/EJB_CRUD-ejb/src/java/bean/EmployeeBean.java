/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import dao.impl.EmployeeDAOImpl;
import entity.Employee;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author Administrator
 */
@Stateless
public class EmployeeBean implements EmployeeBeanLocal {

    @Override
    public List<Employee> getListEmployees() {
        return new EmployeeDAOImpl().getListEmployees();
    }

    @Override
    public Employee getEmployeeById(Integer id) {
        return new EmployeeDAOImpl().getEmployeeById(id);
    }

    @Override
    public boolean insertEmployee(Employee b) {
        return new EmployeeDAOImpl().insertEmployee(b);
    }

    @Override
    public boolean updateEmployee(Employee b) {
        return new EmployeeDAOImpl().updateEmployee(b);
    }

    @Override
    public boolean deleteEmployee(Integer id) {
        return new EmployeeDAOImpl().deleteEmployee(id);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
