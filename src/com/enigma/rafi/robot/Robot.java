package com.enigma.rafi.robot;

import java.lang.invoke.SwitchPoint;

public class Robot {
    private Direction direction;
    private final Coordinate coordinate;

    public Robot(Direction direction, Coordinate coordinate) {
        this.direction = direction;
        this.coordinate = coordinate;
    }

    public void run(String command){
        String[] commands  = command.split("");
        for(String c : commands){
            Command cmd = Command.valueOf(c);
            move(cmd);
            System.out.println(this);
        }
    }

    public void move(Command command){
        switch (command){
            case A:
                forward();
                break;
            case L:
                this.direction = direction.turnLeft();
                break;
            case R:
                this.direction = direction.turnRight();
                break;
        }
    }

    public void forward(){
        switch (direction){
            case EAST:
                coordinate.toRight();
                break;
            case SOUTH:
                coordinate.toBottom();
                break;
            case WEST:
                coordinate.toLeft();
                break;
            case NORTH:
                coordinate.toTop();
                break;
        }
    }

    @Override
    public String toString() {
        return direction + "-> " + coordinate;
    }
}
