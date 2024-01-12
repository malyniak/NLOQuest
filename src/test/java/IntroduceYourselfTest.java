import org.junit.jupiter.api.Test;
import services.AcceptAnswer;
import services.Answer;
import services.IntroduceYourselfService;
import services.RejectAnswer;

import static junit.framework.Assert.assertEquals;
import static services.Answer.ACCEPT;
import static services.Answer.REJECT;

public class IntroduceYourselfTest {
    @Test
    public void testNextStepWhenPlayerSayTruth() {
       IntroduceYourselfService service = new IntroduceYourselfService();
       Answer answer = new AcceptAnswer(ACCEPT);
       Answer resultAnswer = service.checkAnswer("accept");
       assertEquals(answer, resultAnswer);
    }

    @Test
    public void testNextStepWhenPlayerLie() {
        IntroduceYourselfService service = new IntroduceYourselfService();
        Answer answer = new RejectAnswer(REJECT);
        Answer resultAnswer = service.checkAnswer("reject");
        assertEquals(answer, resultAnswer);
    }
}
