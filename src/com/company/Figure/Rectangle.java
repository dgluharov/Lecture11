package com.company.Figure;

public class Rectangle extends GeometryFigure {
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        super(sideA);
        this.sideB = sideB;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }


    @Override
    public double getArea() {
        return this.side * this.sideB;
    }

    @Override
    public double getPerimeter() {
        return (side + sideB) * 2;
    }

    @Override
    public String toString() {
        return "This Rectangle is with sideA - " + this.getSide() +
                ", sideB - " + this.getSideB() + ". His perimeter is - " +
                this.getPerimeter() + ", and his area is - " + this.getArea() + ".";
    }
}
