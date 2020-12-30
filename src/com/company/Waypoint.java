package com.company;

public class Waypoint {
    private int xpos;
    private int ypos;
    private int heightConstraint;       //Height in constraint

    public void Waypoint() {
        //No-arg constructor
        this.xpos = 0;
        this.ypos = 0;
        this.heightConstraint = 0;
    }

    public Waypoint(int xpos, int ypos, int heightConstraint){
        this.xpos = xpos;
        this.ypos = ypos;
        this.heightConstraint = heightConstraint;
    }

    public int getHeightConstraint(){
        return this.heightConstraint;
    }

    public int getXpos(){
        return this.xpos;
    }

    public int getYpos(){
        return this.ypos;
    }
}
