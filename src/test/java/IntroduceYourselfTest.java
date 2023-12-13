import org.junit.jupiter.api.Test;
import services.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntroduceYourselfTest {
    @Test
    public void testNextStepWhenPlayerSayTruth() {
        WinService nextStep=WinService.getService();
        IntroduceYourselfService service=IntroduceYourselfService.getService();
        Answer answer=new Answer("truth");
        service.checkAnswer(answer);
        assertEquals(service.getNextStep(), nextStep);
    }
    @Test
    public void testNextStepWhenPlayerLie() {
        LoseService nextStep=LoseService.getService();
        IntroduceYourselfService service=IntroduceYourselfService.getService();
        Answer answer=new Answer("lie");
        service.checkAnswer(answer);
        assertEquals(service.getNextStep(), nextStep);
    }
}
