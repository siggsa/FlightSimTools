package com.company;

public class Plane {
    private int speed;          //Speed in KTS
    private int height;         //Height in feet
    private int xpos;           //Degrees east
    private int ypos;           //Degrees north

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setXpos(int xpos) {
        this.xpos = xpos;
    }

    public void setYpos(int ypos) {
        this.ypos = ypos;
    }

    private Plane() {
        //No-arg constructor
        this.speed = 0;
        this.height = 0;
        this.xpos = 0;
        this.ypos = 0;
    }

    public Plane(int speed, int height, int xpos, int ypos) {
        if (speed < 0) return;
        if (height < 0) return;

        this.speed = speed;
        this.height = height;
        this.xpos = xpos;
        this.ypos = ypos;
    }

    public int getSpeed(){
        return this.speed;
    }

    public int getHeight(){
        return this.height;
    }

    public int getXpos(){
        return this.xpos;
    }

    public int getYpos(){
        return this.ypos;
    }
}
