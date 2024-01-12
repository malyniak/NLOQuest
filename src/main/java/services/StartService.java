package services;

import org.slf4j.*;
import static services.Answer.*;

public class StartService extends Service {
    private static final Logger logger = LoggerFactory.getLogger(StartService.class);
    public Answer checkAnswer(String answer) {
        if (REJECT.equals(answer)) {
            logger.info("User make choice to reject challenge");
            return new RejectAnswer(REJECT);
        } else {
            logger.info("User make choice to accept challenge");
            return new AcceptAnswer(ACCEPT);
        }

    }
}
