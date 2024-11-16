abstract class Shape {
    protected String color; // Protected access
    protected Boolean filled; // Protected access

    // Constructor
    public Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Setters
    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    // Getters
    public String getColor() {
        return color;
    }

    public Boolean isFilled() {
        return filled;
    }

    // Abstract methods
    abstract Double getArea();

    abstract Double getPerimeter();

    @Override
    public String toString() {
        return "Shape[color=" + color + ", filled=" + (filled ? "filled" : "not filled") + ".";
    }
}
