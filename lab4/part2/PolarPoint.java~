public class PolarPoint
implements Point
{
   public PolarPoint(double radius, double angle)
   {
      PolarPoint.radius = radius;
      PolarPoint.angle = angle;  
   }

   public double xCoordinate()
   {
      return PolarPoint.radius*Math.cos(angle);
   }

   public double yCoordinate()
   {
      return PolarPoint.radius*Math.sin(angle);
   }

   public double radius()
   {
      return PolarPoint.radius;
   }
   
   public double angle()
   {
      return PolarPoint.angle;
   }
   
   public Point rotate90()
   {
      Point rotate_point = new PolarPoint(radius, angle + Math.PI);
      return rotate_point;
   }
      
   
}
