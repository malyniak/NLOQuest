import org.junit.jupiter.api.Test;
import services.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaptainBridgeTest {
    @Test
    public void testNextStepWhenAnswerUpOnBridge() {
        IntroduceYourselfService nextStep=IntroduceYourselfService.getService();
        CaptainBridgeService service=CaptainBridgeService.getService();
        Answer answer=new Answer("accept_up");
        service.checkAnswer(answer);
        assertEquals(service.getNextStep(), nextStep);
    }
    @Test
    public void testNextStepWhenAnswerRejectChallenge() {
        LoseService nextStep=LoseService.getService();
        CaptainBridgeService service=CaptainBridgeService.getService();
        Answer answer=new Answer("reject_up");
        service.checkAnswer(answer);
        assertEquals(service.getNextStep(), nextStep);
    }
}
