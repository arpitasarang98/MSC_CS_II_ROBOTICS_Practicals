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
import ch.aplu.robotsim.*;
public class CirclularMotion {
    public CirclularMotion()
  {
    NxtRobot robot=new NxtRobot();
    Gear gear=new Gear();
    robot.addPart(gear);
    gear.setSpeed(60);
    gear.leftArc(0.2,7000);
    gear.rightArc(0.2);
    Tools.delay(5000);
    robot.exit();
  }
  public static void main(String args[])
  {
    new CirclularMotion();
  }
  }
