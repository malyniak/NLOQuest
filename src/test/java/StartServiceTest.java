import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import services.Answer;
import services.CaptainBridgeService;
import services.LoseService;
import services.StartService;

public class StartServiceTest {
    @Test
    @Disabled
    public void testNextStepWhenAnswerAcceptChallenge() {
        CaptainBridgeService nextStep=CaptainBridgeService.getService();
        StartService service=StartService.getService();
        Answer answer=new Answer("accept");
        service.checkAnswer(answer);
     //   assertEquals(service.getNextStep(), nextStep);
    }
    @Test
    @Disabled
    public void testNextStepWhenAnswerRejectChallenge() {
        LoseService nextStep=LoseService.getService();
        StartService service=StartService.getService();
        Answer answer=new Answer("reject");
        service.checkAnswer(answer);
     //   assertEquals(service.getNextStep(), nextStep);
    }
}
