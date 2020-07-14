package com.team4099.falconcamps.subsystems;

import com.revrobotics.*;

import edu.wpi.first.wpilibj.controller.PIDController;
import edu.wpi.first.wpilibj2.command.PIDCommand;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ShooterPIDSubsystem extends SubsystemBase {
    private final static CANSparkMax shooterLeader = new CANSparkMax(1, CANSparkMaxLowLevel.MotorType.kBrushless);
    private final static CANSparkMax shooterFollower = new CANSparkMax(14, CANSparkMaxLowLevel.MotorType.kBrushless);
    private final static CANEncoder shooterEncoder = shooterLeader.getEncoder();

    public ShooterPIDSubsystem() {
        super(new PIDController(1.7 / 300 , 8.0 , 5.5 * 14000));
        double ShooterP = 1.7 / 300;
        double ShooterI = 8.0;
        double ShooterD = 5.5 * 14000;
        
    }
    public double getCurrentVelocity() {
        return shooterEncoder.getVelocity();
    }
    public void useOutput(double setPoint, double output) {
        shooterLeader.set(output);
    }


    @Override
    public void periodic() {}
}

  
 
