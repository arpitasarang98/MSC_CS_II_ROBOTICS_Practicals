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
import ch.aplu.robotsim.NxtRobot;
import ch.aplu.robotsim.Gear;

public class MoveWithGear {
    public MoveWithGear(){
        NxtRobot robot=new NxtRobot();
        Gear g=new Gear();
        robot.addPart(g);
        g.setSpeed(500);
        g.forward(500);
        g.left(300);
        g.forward(500);
        g.right(300);
        g.forward(500);
        robot.exit();
    }
    public static void main(String arg[])
    {
        new MoveWithGear();
    }
}
