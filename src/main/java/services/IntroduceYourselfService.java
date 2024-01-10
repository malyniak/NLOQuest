package services;
import org.slf4j.*;

public class IntroduceYourselfService extends Service {
    private static final Logger logger = LoggerFactory.getLogger(IntroduceYourselfService.class);
    private static final IntroduceYourselfService service = new IntroduceYourselfService();
    public static final String LIE = "lie";

    private IntroduceYourselfService() {
    }

    public static IntroduceYourselfService getService() {
        return service;
    }

    public boolean checkAnswer(Answer answer) {
        if (LIE.equals(answer.getText())) {
            logger.debug("User make choice to lie");
            return false;
        } else {
            logger.debug("User make choice to say truth");
            return true;
        }
    }
}
