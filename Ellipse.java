public class Ellipse extends Shape {
    
    private int lengthMajorAxis;

    public Ellipse(int x, int y) {
      super(x, y);
      this.lengthMajorAxis = (x > y) ? x : y;   // is larger of { x, y }
    }

    public int getSemiMajorAxis() {
      return this.lengthMajorAxis / 2;
    }
}