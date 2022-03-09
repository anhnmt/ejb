/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.ComputerDAO;
import entity.Computer;
import java.util.List;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author Administrator
 */
public class ComputerDAOImpl implements ComputerDAO{

    @Override
    public List<Computer> getListComputers() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            List<Computer> list = session.createQuery("from Computer").list();
            return list;
        } catch (Exception e) {
            e.printStackTrace();            
        }finally{
            session.close();
        }
        return null;
    }

    @Override
    public Computer getComputerById(Integer comId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            Computer b = (Computer) session.createQuery("from Computer where comId = :comId")
                    .setParameter("comId", comId)
                    .uniqueResult();
            return b;
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            session.close();
        }
        return null;
    }

    @Override
    public boolean insertComputer(Computer b) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.save(b);
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }finally{
            session.close();
        }
        return false;
    }

    @Override
    public boolean updateComputer(Computer b) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.update(b);
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }finally{
            session.close();
        }
        return false;
    }

    @Override
    public boolean deleteComputer(Integer comId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.delete(getComputerById(comId));
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }finally{
            session.close();
        }
        return false;
    }
    
    public static void main(String[] args) {
        System.out.println(new ComputerDAOImpl().getListComputers().size());
    }
}
