
package com.mycompany.project3;

import java.awt.*;


public class Cube extends ThreeDShape{

  private double   side ;
    @Override
    public double getVolume() {
  return  Math.pow(side, 3);

    }
    @Override
    public double getArea() {
        return 6* Math.pow(side, 2);
    }

    @Override
    public double getPerimeter() {
      return  side*12;
    }

    @Override
    public String howToDraw() { 
        return "cube";
        
    }

    public double getSide() {
        return side;
    }

    public Cube(double side) {
        this.side = side;
    }

    public Cube(double side, String color) {
        super(color);
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public int getDepth()
    {
        return (int)side / 3; 
    }

    @Override
    public String toString() {
        return "Cube{" +" color ="+ super.getColor()+"side=" + side + '}';
    }

    @Override
    public void draw(Graphics g, int x, int y) {
        String colorString = this.getColor(); 

        g.setColor(Color.decode(colorString));

        int side = (int)getSide();
        int startX = x; 
        int startY = y; 
        
        int FX = startX;
        int FY = startY;
        
        int BX = startX + getDepth(); 
        int BY = startY - getDepth(); 
        
        g.drawRect(BX, BY, side, side); 
        g.drawRect(FX, FY, side, side);

        g.drawLine(BX, BY, FX, FY); 
        g.drawLine(BX + side, BY, FX + side, FY); 
        
        g.drawLine(BX, BY + side, FX, FY + side); 
        g.drawLine(BX + side, BY + side, FX + side, FY + side);
    }
    
    
    
}
