package pl.zzpj2021.solid.ocp.usa.solution;

public class Alabama extends AbstractSpeedLimitFineStrategy{

    public Alabama(int speedLimit) {
        super(speedLimit);
    }

    @Override
    public double calculateFine(int speed) {
        if(speed > speedLimit)
            return (speed - speedLimit) * 2;
        else
            return 0;
    }
}
