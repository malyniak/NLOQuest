package services;

import org.slf4j.*;

public class StartService extends Service {
    private static final Logger logger = LoggerFactory.getLogger(StartService.class);
    private static final StartService startService = new StartService();
    private static final String REJECT = "reject";

    private StartService() {
    }

    public static StartService getService() {
        return startService;
    }

    public boolean checkAnswer(Answer answer) {
        if (REJECT.equals(answer.getText())) {
            logger.info("User make choice to reject challenge");
            return false;
        } else {
            logger.info("User make choice to accept challenge");
            return true;
        }

    }
}
