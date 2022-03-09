/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Computer;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface ComputerDAO {
    public List<Computer> getListComputers();
    public Computer getComputerById(Integer comId);
    public boolean insertComputer(Computer b);
    public boolean updateComputer(Computer b);
    public boolean deleteComputer(Integer comId);
}
