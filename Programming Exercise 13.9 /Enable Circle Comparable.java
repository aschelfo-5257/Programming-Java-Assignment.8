public class Circle extends GeometricObject implements Comparable<Circle> {
  public Circle() {
    this(0.0);
  }

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    if (radius < 0) throw new IllegalArgumentException("Radius cannot be negative");
    this.radius = radius;
  }

  public double getArea() {
    return radius * radius * Math.PI;
  }

  @Override
  public String toString() {
    return "Circle(radius = " + radius + ")";
  }

  @Override
  public double getPerimeter() {
    return 2 * Math.PI * radius;
  }

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

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Circle circle = (Circle) obj;
    return Double.compare(circle.radius, radius) == 0;
  }
  
  @Override
  public int hashCode() {
    return Double.hashCode(radius);
  }
  
  public static void main(String[] args) {
    Circle o1 = new Circle(10.0);
    Circle o2 = new Circle(5.0);

    System.out.println("o1: " + o1);
    System.out.println("o2: " + o2);
    System.out.println("o1.equals(o2): " + o1.equals(o2));
    System.out.println("o1.compareTo(o2): " + o1.compareTo(o2));
  }
}
