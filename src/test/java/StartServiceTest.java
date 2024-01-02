import org.junit.jupiter.api.Test;
import services.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StartServiceTest {
    @Test
    public void testNextStepWhenAnswerAcceptChallenge() {
        CaptainBridgeService nextService = CaptainBridgeService.getService();
        StartService service = StartService.getService();
        Answer answer = new Answer("accept");
        Service resultService = service.checkAnswer(answer);
        assertEquals(resultService, nextService);
    }
    @Test
    public void testNextStepWhenAnswerRejectChallenge() {
        LoseService nextService = LoseService.getService();
        StartService service = StartService.getService();
        Answer answer = new Answer("reject");
        Service resultService = service.checkAnswer(answer);
        assertEquals(resultService, nextService);
    }
}
