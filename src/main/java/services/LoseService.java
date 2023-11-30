package services;

public class LoseService extends Service{
    private String url="/lose.jsp";
    private static final LoseService service=new LoseService();
    private LoseService() {}

    @Override
    public void checkAnswer(Answer answer) {

    }

    @Override
    public Service getNextStep() {
        return StartService.getService();
    }

    @Override
    public String getUrl() {
        return url;
    }

    public static LoseService getService() {
        return service;
    }
}
