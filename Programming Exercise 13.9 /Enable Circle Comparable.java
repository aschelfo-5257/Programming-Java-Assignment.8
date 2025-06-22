/**
 * The Circle class represents a geometric circle with a radius.
 * It extends GeometricObject and implements Comparable for comparing circles by area.
 */
public class Circle extends GeometricObject implements Comparable<Circle> {
  private double radius;

  /**
   * Constructs a Circle with radius 0.0.
   */
  public Circle() {
    this(0.0);
  }

  /**
   * Constructs a Circle with the specified radius.
   * @param radius the radius of the circle
   */
  public Circle(double radius) {
    setRadius(radius);
  }

  /**
   * Returns the radius of the circle.
   * @return the radius
   */
  public double getRadius() {
    return radius;
  }

  /**
   * Sets the radius of the circle.
   * @param radius the new radius
   * @throws IllegalArgumentException if radius is negative
   */
  public void setRadius(double radius) {
    if (radius < 0) throw new IllegalArgumentException("Radius cannot be negative");
    this.radius = radius;
  }

  /**
   * Returns the area of the circle.
   * @return the area
   */
  public double getArea() {
    return radius * radius * Math.PI;
  }

  /**
   * Returns a string representation of the circle.
   * @return a string describing the circle
   */
  @Override
  public String toString() {
    return "Circle(radius = " + radius + ")";
  }

  /**
   * @return 1 if this is larger, -1 if smaller, 0 if equal
   */
  @Override
  public int compareTo(Circle o) {
    if (this.getArea() > o.getArea()) {
      return 1;
    } else if (this.getArea() < o.getArea()) {
      return -1;
    } else {
      return 0;
    }
  }

  /**
   * Checks if this circle is equal to another object.
   * @param obj the object to compare
   * @return true if equal, false otherwise
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Circle circle = (Circle) obj;
    return Double.compare(circle.radius, radius) == 0;
  }
  
  /**
   * Returns the hash code for this circle.
   * @return the hash code
   */
  @Override
  public int hashCode() {
    return Double.hashCode(radius);
  }
  
  /**
   * Main method for testing the Circle class.
   * @param args command line arguments
   */
  public static void main(String[] args) {
    Circle o1 = new Circle(10.0);
    Circle o2 = new Circle(5.0);

    System.out.println("o1: " + o1);
    System.out.println("o2: " + o2);
    System.out.println("o1.equals(o2): " + o1.equals(o2));
    System.out.println("o1.compareTo(o2): " + o1.compareTo(o2));
  }
}

/**
 * A minimal GeometricObject class to allow Circle to compile.
 * You should replace this with your actual GeometricObject implementation if available.
 */
class GeometricObject {
  public double getPerimeter() { return 0.0; }
  public double getArea() { return 0.0; }
}
