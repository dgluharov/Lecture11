package com.company.Figure;

public abstract class GeometryFigure implements Figure {
    double side;

    public GeometryFigure(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
