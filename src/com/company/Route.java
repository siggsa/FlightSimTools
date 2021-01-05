package com.company;

import java.util.LinkedList;

public class Route {
    private LinkedList<Waypoint> route;

    public Route(){
        this.route = new LinkedList<Waypoint>();
    }

    public void AddWaypoint(Waypoint waypoint) {
        route.add(waypoint);
    }

    public void RemoveLastWaypoint() {
        if (route.isEmpty()){
            return;
        }
        route.removeLast();
    }

    public double getRouteLength(){
        Calculator calc = new Calculator();
        double routeDist = 0;
        for (int i = 1; i < route.size(); i++){
            routeDist += calc.DistanceFromWaypointToWaypoint(route.get(i-1),route.get(i));
        }
        return routeDist;
    }

    public void clearRoute() {
        route.clear();
    }
}
