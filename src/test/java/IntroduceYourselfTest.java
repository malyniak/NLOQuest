import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import services.Answer;
import services.IntroduceYourselfService;
import services.LoseService;
import services.WinService;

public class IntroduceYourselfTest {
    @Test
    @Disabled
    public void testNextStepWhenPlayerSayTruth() {
        WinService nextStep=WinService.getService();
        IntroduceYourselfService service=IntroduceYourselfService.getService();
        Answer answer=new Answer("truth");
        service.checkAnswer(answer);
     //   assertEquals(service.getNextStep(), nextStep);
    }
    @Test
    @Disabled
    public void testNextStepWhenPlayerLie() {
        LoseService nextStep=LoseService.getService();
        IntroduceYourselfService service=IntroduceYourselfService.getService();
        Answer answer=new Answer("lie");
        service.checkAnswer(answer);
      //  assertEquals(service.getNextStep(), nextStep);
    }
}
