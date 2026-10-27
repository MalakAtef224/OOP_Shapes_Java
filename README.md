# OOP Shapes (Java)

A Java application that demonstrates object-oriented programming with a hierarchy of shapes, file I/O and a Swing GUI.

## Features
- `Drawable` interface and abstract `Shape` / `ThreeDShape` classes
- `Circle` and `Cube` classes with area, perimeter (and volume for cubes)
- Reads shapes from `input.txt`, sums their areas and writes the result to `Write.txt`
- Draws all shapes in a Swing window

## Input Format
First line: number of shapes. Then one shape per line (`circle <radius>` or `cube <side>`):
```
3
cube 50
circle 80
cube 60
```

## Technologies
- Java, Swing (AWT Graphics), Maven

## OOP Concepts Used
Inheritance, abstraction, polymorphism, interfaces, encapsulation

## How to Run
Open the project in NetBeans and run `Project3`, with `input.txt` in the project folder.
