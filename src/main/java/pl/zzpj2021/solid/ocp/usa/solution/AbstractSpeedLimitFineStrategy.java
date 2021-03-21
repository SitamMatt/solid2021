package pl.zzpj2021.solid.ocp.usa.solution;

public abstract class AbstractSpeedLimitFineStrategy {
    protected int speedLimit;

    public AbstractSpeedLimitFineStrategy(int speedLimit){
        this.speedLimit = speedLimit;
    }

    public abstract double calculateFine(int speed);
}
