/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import dao.impl.TripDAOImpl;
import entity.Trip;
import java.util.List;
import javax.ejb.Stateful;

/**
 *
 * @author TUANANH
 */
@Stateful
public class TripBean implements TripBeanRemote {

    @Override
    public List<Trip> getListTrips() {
        return new TripDAOImpl().getListTrips();
    }

    @Override
    public List<Trip> getListTrips(String name) {
        return new TripDAOImpl().getListTrips(name);
    }

    @Override
    public Trip getTripById(Integer comId) {
        return new TripDAOImpl().getTripById(comId);
    }

    @Override
    public boolean insertTrip(Trip b) {
        return new TripDAOImpl().insertTrip(b);
    }

    @Override
    public boolean updateTrip(Trip b) {
        return new TripDAOImpl().updateTrip(b);
    }

    @Override
    public boolean deleteTrip(Integer comId) {
        return new TripDAOImpl().deleteTrip(comId);
    }
}
