package com.enigma.rafi.robot;

public class Coordinate {
    private Integer x;
    private Integer y;

    public Coordinate(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public void toTop(){
        this.y += 1;
    }

    public void toRight(){
        this.x += 1;
    }

    public void toLeft(){
        this.x -= 1;
    }

    public void toBottom(){
        this.y -= 1;
    }

    @Override
    public String toString() {
        return  x + ", " + y;
    }
}
