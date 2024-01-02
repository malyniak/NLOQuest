package services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IntroduceYourselfService extends Service implements Checking{
    public static final Logger logger= LoggerFactory.getLogger(IntroduceYourselfService.class);
    private static final IntroduceYourselfService service = new IntroduceYourselfService();
    private IntroduceYourselfService() {
    }
    public static IntroduceYourselfService getService() {
        return service;
    }
    public Service checkAnswer(Answer answer) {
        if(answer.getText().equals("lie")) {
            logger.debug("User make choice to lie");

            return LoseService.getService();
        } else {
            logger.debug("User make choice to say truth");
            return WinService.getService();
        }
    }
}
