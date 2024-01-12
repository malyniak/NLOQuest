package services;
import org.slf4j.*;
import static services.Answer.*;

public class CaptainBridgeService extends Service{
    private final Logger logger = LoggerFactory.getLogger(CaptainBridgeService.class);

    public Answer checkAnswer(String answer) {
        if (REJECT.equals(answer)) {
            logger.info("User make choice don`t up on captain bridge");
            return new RejectAnswer(REJECT);
        } else {
            logger.info("User make choice up on captain bridge");
            return new AcceptAnswer(ACCEPT);
        }
    }
}
