package services;

public class CaptainBridgeService extends Service {
    private static final CaptainBridgeService service=new CaptainBridgeService();
    private Service nextStep;
    private String url="/captain.jsp";
    private CaptainBridgeService() {
    }
    public static CaptainBridgeService getInstance() {
        return service;
    }
    @Override
    public Service getNextStep() {
        return nextStep;
    }

    public String getUrl() {
        return url;
    }
    public void checkAnswer(Answer answer) {
        if(answer.getText().equals("reject")) {
            nextStep= LoseService.getService();
        } else {
            nextStep=IntroduceYourselfService.getInstance();
        }

    }
}
