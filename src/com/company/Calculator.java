package com.company;
import java.lang.Math;

public class Calculator {

    public double DistanceFromPlaneToWaypoint (Plane plane, Waypoint waypoint){
        int dx = plane.getXpos()-waypoint.getXpos();
        int dy = plane.getYpos()-waypoint.getYpos();
        double dist = Math.sqrt(Math.pow(dx,2)+Math.pow(dy,2));
        return dist;
    }

    public double HeightFromPlaneToWaypoint (Plane plane, Waypoint waypoint){
        double delta;
        delta = waypoint.getHeightConstraint()-plane.getHeight();
        return delta;
    }

    /*
     * @return Time from plane to waypoint in minutes from current speed
     */
    public double TimeFromPlaneToWaypoint(Plane plane, Waypoint waypoint){
        int speed = plane.getSpeed();
        double dist = DistanceFromPlaneToWaypoint(plane, waypoint);
        double time = (dist/speed)*60; //Returns minutes
        return time;
    }

    public double CalculateVerticalSpeedFromPlaneToWaypoint(Plane plane, Waypoint waypoint){
        double VS = HeightFromPlaneToWaypoint(plane,waypoint)/TimeFromPlaneToWaypoint(plane,waypoint);
        return VS;
    }
}
