/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Pooja
 */
import ch.aplu.robotsim.TurtleRobot;
public class MoveWithoutGear {
    
    public MoveWithoutGear(){
        TurtleRobot robot=new TurtleRobot();
        robot.forward(50);
        robot.left(45);
        robot.forward(50);
        robot.right(90);
        robot.forward(50);
        robot.exit();
    }
    public static void main(String arg[])
    {
        new MoveWithoutGear();
    }
    
}
