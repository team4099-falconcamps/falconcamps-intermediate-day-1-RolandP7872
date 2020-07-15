package com.team4099.falconcamps;

import com.team4099.falconcamps.subsystems.ShooterPIDSubsystem;

public class RobotContainer {
    private final ShooterPIDSubsystem subsystem = new ShooterPIDSubsystem();
    XboxController driverController = new XboxController(0);
    public RobotContainer() {
        new Trigger(driverController::getAButton).whileActive(new ShooterPIDSubsystem(subsystem));
        subsystem.setDefaultCommand(new ShooterPIDSubsystemIdleCommand(subsystem));
    }
}