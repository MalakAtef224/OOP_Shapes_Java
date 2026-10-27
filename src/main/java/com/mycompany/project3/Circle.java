
package com.mycompany.project3;

import java.awt.*;

public class Circle extends  Shape {

private double raduis ;
@Override
    public double getArea() {
        return Math.PI*raduis*raduis ;
    }

@Override
    public double getPerimeter() {
         return 2*Math.PI*raduis ;
    }

@Override
    public String howToDraw() {
     return "circle";
    }

    public double getRaduis() {
        return raduis;
    }

    public void setRaduis(double raduis) {
        this.raduis = raduis;
    }

    public Circle(double raduis, String color) {
        super(color);
        this.raduis = raduis;
    }

    public Circle(double raduis) {
        this.raduis = raduis;
    }

    @Override
    public String toString() {
        return "Circle{" +" color ="+super.getColor() +"raduis=" + raduis + '}';
    }

    @Override
    public void draw(Graphics g, int x, int y) {
        Color c = Color.decode(getColor());
        g.setColor(c);
        
        int diameter = 2 * (int)getRaduis();
        g.drawOval(x, y, diameter, diameter);
    }
    
}
