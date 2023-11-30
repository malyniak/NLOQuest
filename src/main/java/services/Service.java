package services;
public abstract class Service {
    private Service nextStep;
    public abstract void checkAnswer(Answer answer);
    public abstract Service getNextStep();
    public abstract String getUrl();
}
