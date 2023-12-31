package services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StartService extends Service implements Checking {
    public static final Logger logger = LoggerFactory.getLogger(StartService.class);
    private static final StartService startService = new StartService();
    private String url = "/start.jsp";

    private StartService() {
    }

    public static StartService getService() {
        return startService;
    }

    public String getUrl() {
        return url;
    }

    public Service checkAnswer(Answer answer) {
        if (answer.getText().equals("reject")) {
            logger.info("User make choice to reject challenge");
            return  LoseService.getService();
        } else {
            logger.info("User make choice to accept challenge");
            return CaptainBridgeService.getService();
        }

    }
}
