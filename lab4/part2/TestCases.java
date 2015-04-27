import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;
import org.junit.Test;

public class TestCases
{
   private static final double DELTA = 0.001;

   private Point cart_pt = new CartesianPoint(3.0, 4.0);
   private Point polar_pt = new PolarPoint(4, 1.7);
     
   @Test
   public void testCartx()
   { 
      assertEquals(cart_pt.xCoordinate(),3);
   }

   @Test
   public void testCarty()
   {
      assertEquals(cart_pt.yCoordinate(),4);
   }

   @Test
   public void testCartr()
   {
      assertEquals(cart_pt.radius(),5);
   }

   @Test
   public void testCartangle()
   {
      assertEquals(cart_pt.angle(),.6435,DELTA);
   }

   @Test
   public void testCartrotate()
   {
      assertEquals(cart_pt.rotate90().xCoordinate(),-4,DELTA);
      assertEquals(cart_pt.rotate90().yCoordinate(),3,DELTA);
   }


   @Test
   public void testPolarx()
   {
      assertEquals(polar_pt.xCoordinate(),-.51538);
   }

   @Test
   public void testPolary()
   {
      assertEquals(polar_pt.yCoordinate(),3.9666);
   }

   @Test
   public void testPolarr()
   {
      assertEquals(polar_pt.radius(),4);
   }

   @Test
   public void testPolarangle()
   {
      assertEquals(polar_pt.angle(),1.7);
   }

   @Test
   public void testPolarrotate()
   {
      assertEquals(polar_pt.rotate90().radius(),4,DELTA);
      assertEquals(polar_pt.rotate90().angle(),2.4853,DELTA);
   }

}
