import org.testng.Assert;
import org.testng.annotations.Test;

public class MicrowaveTest {
    @Test
    public void testM001() {
        Microwave myMicrowave = new Microwave("black");
        myMicrowave.setTime(60);
        myMicrowave.warmFood();

        Assert.assertEquals(myMicrowave.mColor, "black");
    }

    @Test
    public void test002GrillMicrowave() {
        MicrowaveWithGrill myGrillMicro = new MicrowaveWithGrill();

        myGrillMicro.setTime(30);
        myGrillMicro.grill();

        myGrillMicro.setColor("white");

        Assert.assertEquals(myGrillMicro.mColor, "white");

    }
}
