import org.junit.jupiter.api.Test;
import services.*;

import static junit.framework.Assert.assertEquals;

public class IntroduceYourselfTest {
    @Test
    public void testNextStepWhenPlayerSayTruth() {
        WinService nextService = WinService.getService();
        IntroduceYourselfService service = IntroduceYourselfService.getService();
        Answer answer = new Answer("truth");
        Service resultService = service.checkAnswer(answer);
        assertEquals(resultService, nextService);
    }

    @Test
    public void testNextStepWhenPlayerLie() {
        LoseService nextService = LoseService.getService();
        IntroduceYourselfService service = IntroduceYourselfService.getService();
        Answer answer = new Answer("lie");
        Service resultService = service.checkAnswer(answer);
        assertEquals(resultService, nextService);
    }
}
