import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import services.Answer;
import services.CaptainBridgeService;
import services.IntroduceYourselfService;
import services.LoseService;

public class CaptainBridgeTest {
    @Test
    @Disabled
    public void testNextStepWhenAnswerUpOnBridge() {
        IntroduceYourselfService nextStep=IntroduceYourselfService.getService();
        CaptainBridgeService service=CaptainBridgeService.getService();
        Answer answer=new Answer("accept_up");
        service.checkAnswer(answer);
     //   assertEquals(service.getNextStep(), nextStep);
    }

    @Test
    @Disabled
    public void testNextStepWhenAnswerRejectChallenge() {
        LoseService nextStep=LoseService.getService();
        CaptainBridgeService service=CaptainBridgeService.getService();
        Answer answer=new Answer("reject_up");
        service.checkAnswer(answer);
   //     assertEquals(service.getNextStep(), nextStep);
    }
}
