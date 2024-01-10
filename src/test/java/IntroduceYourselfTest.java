import org.junit.jupiter.api.Test;
import services.*;

import static junit.framework.Assert.*;

public class IntroduceYourselfTest {
    @Test
    public void testNextStepWhenPlayerSayTruth() {
        IntroduceYourselfService service = IntroduceYourselfService.getService();
        Answer answer = new Answer("truth");
        boolean result = service.checkAnswer(answer);
        assertTrue(result);
    }

    @Test
    public void testNextStepWhenPlayerLie() {
        IntroduceYourselfService service = IntroduceYourselfService.getService();
        Answer answer = new Answer("lie");
        boolean result = service.checkAnswer(answer);
        assertFalse(result);
    }
}
