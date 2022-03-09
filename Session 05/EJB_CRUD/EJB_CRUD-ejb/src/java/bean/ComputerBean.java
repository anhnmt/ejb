/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import dao.impl.ComputerDAOImpl;
import entity.Computer;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author Administrator
 */
@Stateless
public class ComputerBean implements ComputerBeanLocal {

    @Override
    public List<Computer> getListComputers() {
        return new ComputerDAOImpl().getListComputers();
    }

    @Override
    public Computer getComputerById(Integer comId) {
        return new ComputerDAOImpl().getComputerById(comId);
    }

    @Override
    public boolean insertComputer(Computer b) {
        return new ComputerDAOImpl().insertComputer(b);
    }

    @Override
    public boolean updateComputer(Computer b) {
        return new ComputerDAOImpl().updateComputer(b);
    }

    @Override
    public boolean deleteComputer(Integer comId) {
        return new ComputerDAOImpl().deleteComputer(comId);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
