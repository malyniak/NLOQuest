import org.junit.jupiter.api.Test;
import services.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StartServiceTest {
    @Test
    public void testNextStepWhenAnswerAcceptChallenge() {
        CaptainBridgeService nextStep=CaptainBridgeService.getService();
        StartService service=StartService.getService();
        Answer answer=new Answer("accept");
        service.checkAnswer(answer);
        assertEquals(service.getNextStep(), nextStep);
    }
    @Test
    public void testNextStepWhenAnswerRejectChallenge() {
        LoseService nextStep=LoseService.getService();
        StartService service=StartService.getService();
        Answer answer=new Answer("reject");
        service.checkAnswer(answer);
        assertEquals(service.getNextStep(), nextStep);
    }
}
