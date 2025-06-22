public class Circle extends GeometricObject implements Comparable<Circle> {
  private double radius = 0.0;
  public Circle() {
  }

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getArea() {
    return radius * radius * Math.PI;
  }

  @Override
  public String toString() {
    return "Circle(" + "radius" + radius + ')';
  }

  @Override
  public double getPerimeter() {
    return radius * radius * Math.PI;
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
  public static void main(String[] args) {
    Circle o1 = new Circle(10.0);
    Circle o2 = new Circle(5.0);

    System.out.println(o1.equals(o2));
    System.out.println(o1.compareto(o2));
  }
}
