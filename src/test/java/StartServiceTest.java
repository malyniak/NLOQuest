import org.junit.jupiter.api.Test;
import services.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class StartServiceTest {
    @Test
    public void testNextStepWhenAnswerAcceptChallenge() {
        StartService service = StartService.getService();
        Answer answer = new Answer("accept");
        boolean result = service.checkAnswer(answer);
        assertEquals(result, true);
    }
    @Test
    public void testNextStepWhenAnswerRejectChallenge() {
        StartService service = StartService.getService();
        Answer answer = new Answer("reject");
        boolean result = service.checkAnswer(answer);
        assertFalse(result);
    }
}
