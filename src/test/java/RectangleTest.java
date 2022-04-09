import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {

    Rectangle rectangle = new Rectangle(1.5, 2.5);

    @Test
    public void rectangleConstructorLengthTest(){
        Assert.assertEquals(1.5, rectangle.getLength(),0.0);
    }

    @Test
    public void rectangleConstructorWidthTest(){
        Assert.assertEquals(2.5, rectangle.getWidth(),0.0);
    }

    @Test
    public void rectangleSetterLengthTest(){
        rectangle.setLength(1.1);
        Assert.assertEquals(1.1,rectangle.getLength(),0.0);
    }

    @Test
    public void rectangleSetterWidthTest(){
        rectangle.setWidth(2.1);
        Assert.assertEquals(2.1,rectangle.getWidth(),0.0);
    }

    @Test
    public void rectangleGetAreaTest(){
        rectangle.setLength(2);
        rectangle.setWidth(3);
        Assert.assertEquals(6,rectangle.getArea(),0.0);
    }
}
