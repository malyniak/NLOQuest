package services;

public class StartService extends Service {
    private static final StartService startService=new StartService();
    private String url="/start.jsp";
    private Service nextStep;
    private StartService() {
    }
    public static StartService getService() {
        return startService;
    }

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
            nextStep=CaptainBridgeService.getInstance();
        }

    }
}
