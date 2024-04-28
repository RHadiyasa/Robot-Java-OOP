package com.enigma.rafi;

import com.enigma.rafi.Helper;
import com.enigma.rafi.robot.Coordinate;
import com.enigma.rafi.robot.Direction;
import com.enigma.rafi.robot.Robot;

import static com.enigma.rafi.robot.Direction.NORTH;

public class Main {
    public static void main(String[] args) {
        Direction east = Direction.NORTH;
        Coordinate coordinate = new Coordinate(0, 0);
        Robot robot = new Robot(east, coordinate);
        robot.run("AAARAAA");
    }
}
