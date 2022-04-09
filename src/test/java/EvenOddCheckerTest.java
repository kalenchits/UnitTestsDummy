import org.junit.Assert;
import org.junit.Test;


public class EvenOddCheckerTest {

    EvenOddChecker evenOddChecker = new EvenOddChecker();

    @Test
    public void checkEvenTest(){
        Assert.assertEquals("Entered number is not even", true, evenOddChecker.check(4));
    }

    @Test
    public void checkOddTest(){
        Assert.assertEquals("Entered number is not odd", false, evenOddChecker.check(5));
    }

}
