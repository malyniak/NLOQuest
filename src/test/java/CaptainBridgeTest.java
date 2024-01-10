import org.junit.jupiter.api.Test;
import services.*;

import static org.junit.jupiter.api.Assertions.*;

public class CaptainBridgeTest {
    @Test
    public void testNextStepWhenAnswerUpOnBridge() {
        CaptainBridgeService service=CaptainBridgeService.getService();
        Answer answer=new Answer("accept_up");
        boolean result = service.checkAnswer(answer);
        assertTrue(result);
    }

    @Test
    public void testNextStepWhenAnswerRejectChallenge() {
        CaptainBridgeService service=CaptainBridgeService.getService();
        Answer answer=new Answer("reject_up");
        boolean result = service.checkAnswer(answer);
        assertFalse(result);
    }
}
