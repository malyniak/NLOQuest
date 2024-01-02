package services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CaptainBridgeService extends Service implements Checking {
    public static final Logger logger=LoggerFactory.getLogger(CaptainBridgeService.class);
    private static final CaptainBridgeService service=new CaptainBridgeService();
    private CaptainBridgeService() {
    }
    public static CaptainBridgeService getService() {
        return service;
    }


    public Service checkAnswer(Answer answer) {
        if(answer.getText().equals("reject_up")) {
            logger.info("User make choice don`t up on captain bridge");
            return LoseService.getService();
        } else {
            logger.info("User make choice up on captain bridge");
            return IntroduceYourselfService.getService();
        }

    }
}
