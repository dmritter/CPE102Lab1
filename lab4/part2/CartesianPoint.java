public class CartesianPoint
implements Point
{
   public CartesianPoint(double x_coord, double y_coord)
   {
      CartesianPoint.x_coord = x_coord;
      CartesianPoint.y_coord = y_coord;  
   }

   public double xCoordinate()
   {
      return CartesianPoint.x_coord;
   }

   public double yCoordinate()
   {
      return CartesianPoint.y_coord;
   }

   public double radius()
   {
      return Math.sqrt(CartesianPoint.y_coord*CartesianPoint.y_coord +
                        CartesianPoint.x_coord*CartesianPoint.x_coord);
   }
   
   public double angle()
   {
      if(CartesianPoint.x_coord == 0 && CartesianPoint.y_coord == 0)
      {
         return 0;
      }
      return Math.atan2(CartesianPoint.x_coord / CartesianPoint.y_coord);
   }
   
   public Point rotate90()
   {
      Point rotate_point = new CartesianPoint(-1 * CartesianPoint.y_coord,
                                             CartesianPoint.x_coord);
      return rotate_point;
   }
      
   
}
