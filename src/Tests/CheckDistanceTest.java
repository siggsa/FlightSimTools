package Tests;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.company.Calculator;
import com.company.Plane;
import com.company.Waypoint;
//import org.junit.Test;
//import static org.junit.Assert.assertEquals;

public class CheckDistanceTest {
    //System.out.println("Initialize classes");
    Calculator calc = new Calculator();
    Plane plane = new Plane(0,0,500,0);
    Waypoint waypoint = new Waypoint(0,0,0);

    //System.out.println("Calculate distance");
    double dist = calc.DistanceFromPlaneToWaypoint(plane,waypoint);
    double height = calc.HeightFromPlaneToWaypoint(plane,waypoint);

    public void correctDistance() {
        
    }

}
