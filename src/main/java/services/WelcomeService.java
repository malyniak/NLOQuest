package services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WelcomeService extends Service {
    public static final Logger logger = LoggerFactory.getLogger(WelcomeService.class);
    private static final WelcomeService service = new WelcomeService();
    private Service nextStep;

    private WelcomeService() {
    }

    @Override
    public Service getNextStep() {
        return nextStep;
    }

    @Override
    public String getUrl() {
        return "/welcome.jsp";
    }

    public static WelcomeService getService() {
        return service;
    }

    public void checkAnswer(Answer answer) {
        if (answer.getText().equals("StartQuest")) {
            nextStep = InputNameService.getService();
            logger.info("User make choice to start  quest");
        } else
            logger.info("User make choice to read story");
    }
}
