import org.junit.jupiter.api.Test;
import services.AcceptAnswer;
import services.Answer;
import services.CaptainBridgeService;
import services.RejectAnswer;

import static junit.framework.Assert.assertEquals;
import static services.Answer.ACCEPT;
import static services.Answer.REJECT;

public class CaptainBridgeTest {
    @Test
    public void testNextStepWhenAnswerUpOnBridge() {
      CaptainBridgeService service=new CaptainBridgeService();
       Answer answer=new AcceptAnswer(ACCEPT);
       Answer resultAnswer = service.checkAnswer("accept");
       assertEquals(answer, resultAnswer);
    }

    @Test
    public void testNextStepWhenAnswerRejectChallenge() {
        CaptainBridgeService service=new CaptainBridgeService();
        Answer answer=new RejectAnswer(REJECT);
        Answer resultAnswer = service.checkAnswer("reject");
        assertEquals(answer, resultAnswer);
    }
}
