import math
import classes

def area(shape):
    if isinstance(shape,classes.Circle):
        return shape.radius**2*math.pi
    elif isinstance(shape,classes.Square):
        return shape.side**2
    elif isinstance(shape,classes.Rectangle):
        return shape.width*shape.height
    else:
        raise TypeError
   
