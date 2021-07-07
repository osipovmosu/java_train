import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

    @Test
    public void testDistance(){
        Point p = new Point(3,2,7,8);
        //assert p.distance() == 7.0;
        Assert.assertEquals(p.distance(),7.0);

    }

    @Test
    public void testDistance2() {

        Point p2 = new Point(0,0,0,0);
        //assert p.distance() == 0.0;
        Assert.assertEquals(p2.distance(),0.0);
    }

}
