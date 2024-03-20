package rectangle;

/**
 *
 * @author ProvenSoft
 */
public class Rectangle {
    //attributes
    private double base;
    private double height;
    //constructors
    /**
     * default constructor
     */
    public Rectangle() {
        
    }
    
    /**
     * full initialization contructor
     * @param base the base of the rectangle
     * @param height the height of the rectangle
     */
    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    
    /**
     * copy constructor
     * @param other the other rectangle
     */
    public Rectangle(Rectangle other) {
        this.base = other.base;
        this.height = other.height;
    }
    
    //accesssors
    public double getBase() {
        return base;
    }
    
    public void setBase(double base) {
        this.base = base;
    }
    
    public double getHeight() {
        return this.height;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    //methods
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rectangle{");
        sb.append("base=");
        sb.append(base);
        sb.append(", height=");
        sb.append(height);
        sb.append("}");        
        return sb.toString();
    }

    /**
     * compares this with obj
     * A rectangle is equal to another if its base is equal
     * to base of the other and height is equal to the one of the other.
     * or if base equals other height and height equals other base.
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
                if (obj instanceof Rectangle) {  //object is a Rectangle
                    Rectangle other = (Rectangle) obj;  //type cast
                    b = ( ((this.base==other.base) 
                            && (this.height==other.height))
                            ||
                          ((this.base==other.height) 
                            && (this.height==other.base)) 
                        );
                } else {
                    b = false;
                }
            }
        }
        return b;
    }
    
    public double perimeter() {
        return 2.0 * (base + height);
    }
    
    public double area() {
        return base * height;
    }
    
}
