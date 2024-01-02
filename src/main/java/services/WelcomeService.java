package services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WelcomeService extends Service {
    public static final Logger logger = LoggerFactory.getLogger(WelcomeService.class);
    private static final WelcomeService service = new WelcomeService();

    private WelcomeService() {
    }

    public static WelcomeService getService() {
        return service;
    }

    public Service checkAnswer(Answer answer) {
        logger.info("Starts...");
        return InputNameService.getService();

    }
}
