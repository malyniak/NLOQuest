package services;
import playerInfo.Player;

public abstract class Service {
    private Player player;
    private Service nextStep;
    public abstract Service getNextStep();
    public abstract String getUrl();
}
