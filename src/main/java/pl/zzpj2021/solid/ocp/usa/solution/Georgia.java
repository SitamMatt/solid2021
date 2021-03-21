package pl.zzpj2021.solid.ocp.usa.solution;

public class Georgia extends AbstractSpeedLimitFineStrategy{

    public Georgia(int speedLimit) {
        super(speedLimit);
    }

    @Override
    public double calculateFine(int speed) {
        if (speed > speedLimit)
            return (speed - speedLimit) * 2.5;
        else
            return 0;
    }
}
