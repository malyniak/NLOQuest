package services;
import org.slf4j.*;

public class CaptainBridgeService extends Service{
    private static final Logger logger = LoggerFactory.getLogger(CaptainBridgeService.class);
    private static final CaptainBridgeService service = new CaptainBridgeService();
    private static final String REJECT = "reject_up";

    private CaptainBridgeService() {
    }

    public static CaptainBridgeService getService() {
        return service;
    }

    public boolean checkAnswer(Answer answer) {
        if (REJECT.equals(answer.getText())) {
            logger.info("User make choice don`t up on captain bridge");
            return false;
        } else {
            logger.info("User make choice up on captain bridge");
            return true;
        }
    }
}
