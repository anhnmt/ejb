/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.TripDAO;
import entity.Trip;
import java.util.List;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author Administrator
 */
public class TripDAOImpl implements TripDAO{

    @Override
    public List<Trip> getListTrips() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            List<Trip> list = session.createQuery("from Trip").list();
            return list;
        } catch (Exception e) {
            e.printStackTrace();            
        }finally{
            session.close();
        }
        return null;
    }

    @Override
    public List<Trip> getListTrips(String name) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            List<Trip> list = session.createQuery("from Trip where tripName like :tripName")
                    .setParameter("tripName", "%" + name + "%")
                    .list();
            return list;
        } catch (Exception e) {
            e.printStackTrace();            
        }finally{
            session.close();
        }
        return null;
    }

    @Override
    public Trip getTripById(Integer tripId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            Trip b = (Trip) session.createQuery("from Trip where tripId = :tripId")
                    .setParameter("tripId", tripId)
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
    public boolean insertTrip(Trip b) {
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
    public boolean updateTrip(Trip b) {
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
    public boolean deleteTrip(Integer tripId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.delete(getTripById(tripId));
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
        System.out.println(new TripDAOImpl().getListTrips().size());
    }
}
