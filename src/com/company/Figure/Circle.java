package com.company.Figure;

public class Circle extends GeometryFigure {
    public Circle(double side) {
        super(side);
    }

    @Override
    public double getArea() {
        return Math.PI * this.side * this.side;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.side;
    }

    @Override
    public String toString() {
        return "This Circle is with radius - " + this.side + ". His perimeter is - " + this.getPerimeter() +
                ", and his area is- " + this.getArea() + ".";
    }
}
