package com.team4099.falconcamps.subsystems;

import com.revrobotics.*;

import edu.wpi.first.wpilibj2.command.PIDCommand;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ShooterPIDSubsystem extends SubsystemBase {
    private final CANSparkMax shooterLeader = new CANSparkMax(1, CANSparkMaxLowLevel.MotorType.kBrushless);
    private final CANSparkMax shooterFollower = new CANSparkMax(14, CANSparkMaxLowLevel.MotorType.kBrushless);
    private final CANEncoder shooterEncoder = shooterLeader.getEncoder();

    public ShooterPIDSubsystem() {
        double shooterLeader = 1.7 / 300;
        double shooterFollower = 8.0;
        double shooterEncoder = 5.5 * 14000;
        super(new PIDCommand(shooterLeader , shooterFollower , shooterEncoder ));
    }
    public double useMeasurement(){
        return getCurrentVelocity()
    }
    public void useOutput(double setPoint, double output){
        shooterLeader.set(output);
    }

    @Override
    public void periodic() {}
}
