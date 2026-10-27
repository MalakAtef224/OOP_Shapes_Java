package com.mycompany.project3;
 
import java.awt.Dimension;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.*;

public class Project3{
    public static void main(String args[]) throws FileNotFoundException 
    {
       
        final String inputFileName = "input.txt";
        final String outputFileName = "Write.txt";

        
        File fileIn = new File(inputFileName);
        Scanner in = in=new Scanner(fileIn);
        Drawable[] drawables;
        double areaSum = 0.0;

        try 
        {
            String y=in .next();
            int nShapes = Integer.parseInt(y);
            if (nShapes<=0){
                System.out.println(" size array must be positive number ,we convert the negative to positive number");
                nShapes=Math.abs(nShapes);
            }
            drawables = new Drawable[nShapes];
            
            int i = 0;

    while (i < nShapes && in.hasNext()) {

    String shapeStr = in.next();
    String l = in.next();
    double len = Double.parseDouble(l);

    if (len < 0) {
        len = Math.abs(len);
    }

    switch (shapeStr) {
        case "circle":
        case "Circle":
            drawables[i++] = new Circle(len);
            System.out.println("Addind circle"+len);
            break;

        case "cube":
        case "Cube":
             System.out.println("Addind cube"+len);
            drawables[i++] = new Cube(len);
            break;

        default:
            
            break;
       }

       areaSum += ((Shape) drawables[i - 1]).getArea();
       System.out.println("Area sum = "+areaSum);
       }


            try (
                FileWriter fileout = new FileWriter(outputFileName);
                PrintWriter printWriter = new PrintWriter(fileout);
            )
            {
                printWriter.print("The Sum Of Areas = " +areaSum);
            }
            catch (IOException e)
            {
                System.err.println("Error Occurred during file writing\n" + e.getMessage());
                return;
            }
            
        }
        catch (Exception e)
        {
            System.err.println("File not found: " + e.getMessage());
            return;
        }

        

         JFrame frame = new JFrame("OOP Shapes GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ShapeDrawingPanel panel = new ShapeDrawingPanel(drawables);
        frame.add(panel);

        frame.setPreferredSize(new Dimension(500, 500));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}