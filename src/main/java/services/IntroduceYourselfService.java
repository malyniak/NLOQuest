package services;

import org.slf4j.*;
import static services.Answer.*;

public class IntroduceYourselfService extends Service {
    private static final Logger logger = LoggerFactory.getLogger(IntroduceYourselfService.class);

    public Answer checkAnswer(String answer) {
        if (REJECT.equals(answer)) {
            logger.debug("User make choice to lie");
            return new RejectAnswer(REJECT);
        } else {
            logger.debug("User make choice to say truth");
            return new AcceptAnswer(ACCEPT);
        }
    }
}
