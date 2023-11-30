package services;

public class IntroduceYourselfService extends Service {
    private static final IntroduceYourselfService service = new IntroduceYourselfService();
    private String url = "/introduce.jsp";
    private Service nextStep;

    @Override
    public Service getNextStep() {
        return nextStep;
    }
    private IntroduceYourselfService() {}
    @Override
    public String getUrl() {
        return url;
    }

    public static IntroduceYourselfService getInstance() {
        return service;
    }
    public void checkAnswer(Answer answer) {
        if(answer.getText().equals("lie")) {
            nextStep= LoseService.getService();
        } else {
            nextStep=WinService.getService();
        }

    }
}
