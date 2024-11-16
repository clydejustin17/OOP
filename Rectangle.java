class Rectangle extends Shape {
    private Double length;
    private Double width;

    // Constructor
    public Rectangle(double length, double width, String color, Boolean filled) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    // Setters and Getters
    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public Double getArea() {
        return length * width;
    }

    @Override
    public Double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle[length=" + length + ", width=" + width + ", " + super.toString() + "]";
    }
}