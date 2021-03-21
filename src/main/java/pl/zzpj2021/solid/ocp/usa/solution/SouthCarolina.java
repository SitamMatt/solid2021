package pl.zzpj2021.solid.ocp.usa.solution;

public class SouthCarolina extends AbstractSpeedLimitFineStrategy{

    public SouthCarolina(int speedLimit) {
        super(speedLimit);
    }

    @Override
    public double calculateFine(int speed) {
        if(speed > speedLimit)
            return (speed - speedLimit)*(speed - speedLimit);
        else
            return 0;
    }
}
