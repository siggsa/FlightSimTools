package Tests;

import com.company.Route;
import com.company.Waypoint;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RouteTest {

    Waypoint waypointA = new Waypoint(0,0,0);
    Waypoint waypointB = new Waypoint(0,0,0);
    Waypoint waypointC = new Waypoint(0,0,0);
    Waypoint waypointD = new Waypoint(0,0,0);
    Route route = new Route();

    @BeforeEach
    public void initEach(){
        route.clearRoute();

        waypointA.setXpos(0);
        waypointA.setYpos(0);

        waypointB.setXpos(0);
        waypointB.setYpos(0);

        waypointC.setXpos(0);
        waypointC.setYpos(0);

        waypointD.setXpos(0);
        waypointD.setYpos(0);
    }

    @Test
    public void checkRouteDistanceZero() {
        route.AddWaypoint(waypointA);
        route.AddWaypoint(waypointB);
        double routeDist = route.getRouteLength();
        Assertions.assertEquals(0,routeDist);
    }

    @Test
    public void checkRouteDistanceFivehundred(){
        waypointB.setXpos(500);
        route.AddWaypoint(waypointA);
        route.AddWaypoint(waypointB);
        double routeDist = route.getRouteLength();
        Assertions.assertEquals(500,routeDist);
    }

    @Test
    public void checkRouteDistanceMultipleWaypoints(){
        waypointB.setXpos(500);
        waypointD.setYpos(1500);
        route.AddWaypoint(waypointA);
        route.AddWaypoint(waypointB);
        route.AddWaypoint(waypointC);
        route.AddWaypoint(waypointD);
        double routeDist = route.getRouteLength();
        Assertions.assertEquals(2500,routeDist);
    }
}