package services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StartService extends Service implements Checking {
    public static final Logger logger = LoggerFactory.getLogger(StartService.class);
    private static final StartService startService = new StartService();
    private String url = "/start.jsp";
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
        if (answer.getText().equals("reject")) {
            nextStep = LoseService.getService();
            logger.info("User make choice to reject challenge");
        } else {
            nextStep = CaptainBridgeService.getService();
            logger.info("User make choice to accept challenge");
        }

    }
}
