/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import entity.Employee;
import java.util.List;
import org.hibernate.Session;
import util.HibernateUtil;
import dao.EmployeeDAO;

/**
 *
 * @author Administrator
 */
public class EmployeeDAOImpl implements EmployeeDAO{

    @Override
    public List<Employee> getListEmployees() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            List<Employee> list = session.createQuery("from Employee").list();
            return list;
        } catch (Exception e) {
            e.printStackTrace();            
        }finally{
            session.close();
        }
        return null;
    }

    @Override
    public Employee getEmployeeById(Integer id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            Employee b = (Employee) session.createQuery("from Employee where id = :id")
                    .setParameter("id", id)
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
    public boolean insertEmployee(Employee b) {
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
    public boolean updateEmployee(Employee b) {
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
    public boolean deleteEmployee(Integer id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.delete(getEmployeeById(id));
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
        System.out.println(new EmployeeDAOImpl().getListEmployees().size());
    }
}
