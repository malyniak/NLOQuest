import org.junit.jupiter.api.Test;
import services.AcceptAnswer;
import services.Answer;
import services.RejectAnswer;
import services.StartService;

import static junit.framework.Assert.assertEquals;
import static services.Answer.ACCEPT;
import static services.Answer.REJECT;

public class StartServiceTest {
    @Test
    public void testNextStepWhenAnswerAcceptChallenge() {
       StartService service = new StartService();
       Answer answer = new AcceptAnswer(ACCEPT);
       Answer resultAnswer = service.checkAnswer("accept");
       assertEquals(answer, resultAnswer);
    }
    @Test
    public void testNextStepWhenAnswerRejectChallenge() {
        StartService service = new StartService();
        Answer answer = new RejectAnswer(REJECT);
        Answer resultAnswer = service.checkAnswer("reject");
        assertEquals(answer, resultAnswer);
    }
}
