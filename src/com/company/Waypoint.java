package com.company;

public class Waypoint {
    private int xpos;
    private int ypos;
    private int heightConstraint;       //Height in constraint

    public void setXpos(int xpos) {
        this.xpos = xpos;
    }

    public void setYpos(int ypos) {
        this.ypos = ypos;
    }

    public void setHeightConstraint(int heightConstraint) {
        this.heightConstraint = heightConstraint;
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
