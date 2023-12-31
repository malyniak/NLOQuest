package services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IntroduceYourselfService extends Service implements Checking{
    public static final Logger logger= LoggerFactory.getLogger(IntroduceYourselfService.class);
    private static final IntroduceYourselfService service = new IntroduceYourselfService();
    private String url = "/introduce.jsp";
    private Service nextStep;
    private int score=0;

    private IntroduceYourselfService() {
    }
    @Override
    public String getUrl() {
        return url;
    }

    public static IntroduceYourselfService getService() {
        return service;
    }
    public Service checkAnswer(Answer answer) {
        if(answer.getText().equals("lie")) {
            nextStep= LoseService.getService();
            logger.debug("User make choice to lie");
            return LoseService.getService();
        } else {
            nextStep=WinService.getService();
            score++;
            logger.debug("User make choice to say truth");
            return WinService.getService();
        }
    }

    public int getScore() {
        return score;
    }
}
