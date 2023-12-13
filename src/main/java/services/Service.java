package services;

public abstract class Service {
    public abstract Service getNextStep();
    public abstract String getUrl();
}
