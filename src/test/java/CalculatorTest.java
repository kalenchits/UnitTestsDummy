import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {


        Calculator calculator = new Calculator();

        @Test
        public void addTest(){
            Assert.assertEquals("Result of add is not correct", 15, calculator.add(10,5));
        }

        @Test
        public void subtractTest(){
            Assert.assertEquals("Result of subtract is not correct", 5, calculator.subtract(10,5));
        }

        @Test
        public void multiplyTest(){
            Assert.assertEquals("Result of multiply is not correct", 50, calculator.multiply(10,5));
        }

        @Test
        public void divideTest(){
            Assert.assertEquals("Result of divide is not correct", 2, calculator.divide(10,5));
        }




    }
