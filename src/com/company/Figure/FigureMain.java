package com.company.Figure;

import java.util.ArrayList;

public class FigureMain {
    public static void main(String[] args) {
        ArrayList<Figure> figureArrayList = new ArrayList<>();
        figureArrayList.add(new Circle(3));
        figureArrayList.add(new Rectangle(5, 6));
        figureArrayList.add(new Rectangle(4, 7));

        System.out.println("The figure with largest area is: " + getFigureWithLargestArea(figureArrayList));
    }

    public static Figure getFigureWithLargestArea(ArrayList<Figure> figures) {
        Figure figure = null;
        double maxArea = 0;

        for (Figure figure1 : figures) {
            if (figure1.getArea() > maxArea) {
                maxArea = figure1.getArea();
                figure = figure1;
            }
        }
        return figure;
    }
}
