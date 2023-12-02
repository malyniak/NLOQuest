package services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CaptainBridgeService extends Service implements Checking {
    public static final Logger logger=LoggerFactory.getLogger(CaptainBridgeService.class);
    private static final CaptainBridgeService service=new CaptainBridgeService();
    private Service nextStep;
    private String url="/captain.jsp";
    private CaptainBridgeService() {
    }
    public static CaptainBridgeService getInstance() {
        return service;
    }
    @Override
    public Service getNextStep() {
        return nextStep;
    }

    public String getUrl() {
        return url;
    }

    public void checkAnswer(Answer answer) {
        if(answer.getText().equals("reject")) {
            nextStep= LoseService.getService();
            logger.info("User make choice don`t up on captain bridge");
        } else {
            nextStep=IntroduceYourselfService.getInstance();
            logger.info("User make choice up on captain bridge");
        }

    }
}
