package com.company;

public class Main {

    public static void main(String[] args) {
	    //sampleTest();
    }

    public static void sampleTest() {
        System.out.println("Initialize classes");
        Calculator calc = new Calculator();
        Plane plane = new Plane(350,20000,50,0);
        Waypoint waypoint = new Waypoint(0,0,3000);

        System.out.println("Calculate distance");
        double dist = calc.DistanceFromPlaneToWaypoint(plane,waypoint);
        double height = calc.HeightFromPlaneToWaypoint(plane,waypoint);
        double time = calc.TimeFromPlaneToWaypoint(plane, waypoint);
        double VS = calc.CalculateVerticalSpeedFromPlaneToWaypoint(plane,waypoint);
        System.out.println(dist);
        System.out.println(height);
        System.out.println(time);
        System.out.println(VS);
    }
}
