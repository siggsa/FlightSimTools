package Tests;

import com.company.Calculator;
import com.company.Plane;
import com.company.Waypoint;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calc = new Calculator();
    Plane plane = new Plane(0,0,0,0);
    Waypoint waypoint = new Waypoint(0,0,0);

    @Test
    public void checkXDistanceCorrect() {
        plane.setXpos(0);
        plane.setYpos(0);
        waypoint.setXpos(500);
        waypoint.setYpos(0);
        double dist = calc.DistanceFromPlaneToWaypoint(plane, waypoint);
        Assertions.assertEquals(500,dist);
    }

    @Test
    public void checkYDistanceCorrect() {
        plane.setXpos(0);
        plane.setYpos(0);
        waypoint.setXpos(0);
        waypoint.setYpos(600);
        double dist = calc.DistanceFromPlaneToWaypoint(plane, waypoint);
        Assertions.assertEquals(600,dist);
    }

    @Test
    public void checkXYDistanceCorrect() {
        plane.setXpos(1000);
        plane.setYpos(1000);
        waypoint.setXpos(10000);
        waypoint.setYpos(10000);
        double dist = calc.DistanceFromPlaneToWaypoint(plane, waypoint);
        Assertions.assertEquals(12727.922061357855,dist);
    }

    @Test
    public void checkTimeCorrect() {
        plane.setXpos(0);
        plane.setYpos(0);
        waypoint.setXpos(0);
        waypoint.setYpos(1000);
        plane.setSpeed(200);
        double time = calc.TimeFromPlaneToWaypoint(plane,waypoint);
        Assertions.assertEquals(300,time);
    }

}