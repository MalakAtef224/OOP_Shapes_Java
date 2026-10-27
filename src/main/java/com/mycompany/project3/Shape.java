
package com.mycompany.project3;

import java.util.Date;


public  abstract class Shape implements Drawable {

    private Date datecreated;
    private String color ;

    public void setDatecreated(Date datecreated) {
        this.datecreated = datecreated;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getDatecreated() {
        return datecreated;
    }

    public String getColor() {
        return color;
    }

    public Shape() {
      
        this.color = "#0000FF";
    }

    public Shape(String color) {
        this.color = color;
    }
     public abstract double getArea();
       public abstract double getPerimeter();
    
    
}
