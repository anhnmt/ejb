/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import entity.Computer;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Administrator
 */
@Local
public interface ComputerBeanLocal {

    public List<Computer> getListComputers();

    public Computer getComputerById(Integer comId);

    public boolean insertComputer(Computer b);

    public boolean updateComputer(Computer b);

    public boolean deleteComputer(Integer comId);
}
