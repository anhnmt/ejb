/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Trip;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface TripDAO {
    public List<Trip> getListTrips();
    public List<Trip> getListTrips(String name);
    public Trip getTripById(Integer tripId);
    public boolean insertTrip(Trip b);
    public boolean updateTrip(Trip b);
    public boolean deleteTrip(Integer tripId);
}
