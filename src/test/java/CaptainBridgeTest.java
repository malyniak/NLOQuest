import org.junit.jupiter.api.Test;
import services.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaptainBridgeTest {
    @Test
    public void testNextStepWhenAnswerUpOnBridge() {
        IntroduceYourselfService nextService=IntroduceYourselfService.getService();
        CaptainBridgeService service=CaptainBridgeService.getService();
        Answer answer=new Answer("accept_up");
        Service resultService = service.checkAnswer(answer);
        assertEquals(resultService, nextService);
    }

    @Test
    public void testNextStepWhenAnswerRejectChallenge() {
        LoseService nextService=LoseService.getService();
        CaptainBridgeService service=CaptainBridgeService.getService();
        Answer answer=new Answer("reject_up");
        Service resultService = service.checkAnswer(answer);
        assertEquals(resultService, nextService);
    }
}
