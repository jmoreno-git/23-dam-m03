package point;

/**
 *
 * @author ProvenSoft
 */
public class Point {
    //attributes (instance)
    private double x;
    private double y;
    //constructors
    /**
     * default constructor
     */
    public Point() {
        x = 0.0;
        y = 0.0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    //accessors
    public double getX() {
        return x;
    }
    
    public void setX(double x) {
        this.x = x;
    }
    
    //methods
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Point{");
        sb.append("x=");
        sb.append(x);
        sb.append(", y=");
        sb.append(y);
        sb.append("}");
        return sb.toString();
    }
    
    /**
     * compares this with obj
     * Two points are considered equals if each coordinate 
     * is equal to the correponding one of the other object.
     * @param obj the object to compare with
     * @return true if equals, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        boolean b;
        if (this == obj) {  //same object
            b = true;
        } else {
            if (obj == null) {  //null object
                b = false;
            } else {
                if (obj instanceof Point) {  //object is a Point
                    Point other = (Point) obj;
                    b = ( (this.x==other.x) && (this.y==other.y) );
                } else {
                    b = false;
                }
            }
        }
        return b;
    }
    
    /**
     * calculates distance to other point
     * @param other the second point
     * @return the distance
     */
    public double distance(Point other) {
        return ( Math.hypot( other.x-this.x , other.y-this.y  ) );   
    }
}
