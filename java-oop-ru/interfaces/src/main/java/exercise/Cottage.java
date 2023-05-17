package exercise;

// BEGIN
class Cottage implements Home {
    private double area;
    private int floorCount;

    Cottage (double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    public double getArea() {
        return area;
    }

    public String toString () {
        return this.floorCount + " этажный коттедж площадью " + this.getArea() + " метров";
    }

    public int compareTo (Home another) {
        if (this.getArea() == another.getArea()) {
            return 0;
        }
        return this.getArea() > another.getArea() ? 1 : -1;
    }
}
// END
