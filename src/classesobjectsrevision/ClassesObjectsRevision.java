/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classesobjectsrevision;

import java.util.ArrayList;

/**
 *
 * @author celeb
 */
public class ClassesObjectsRevision {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        DataIO input = new DataIO();
        
//        String[] data = input.getData();
        
        
        
        
        String[] rectangleNames = {"Rect1", "Recty", "Bad Square"};
        int[] rectangleLengths = {3, 7, 1};
        int[] rectangleWidths = {2, 6, 8};
        
        int area = rectangleLengths[2] * rectangleWidths[2];
        
        Rectangle rect1 = new Rectangle(3, 2);
//        System.out.println(rect1.length);
//        rect1.width;

        Circle circle1 = new Circle(4);
        
        ArrayList<Rectangle> rectList = new ArrayList<>();
        rectList.add(rect1);
//        rectList.add(circle1);
        Shape shape1 = new Rectangle(5, 5);

        /*
            Polymorphism - Rectangles can also act as shapes!
        */
        
        
        
        ArrayList<Shape> shapeList = new ArrayList<>();
        
//        shapeList.
        
        shapeList.add(rect1);
        shapeList.add(circle1);
        shapeList.add(shape1);
        
        for (Shape shape : shapeList) {
            System.out.println(shape.isFilled()); // Cannot access rectangle or circle specific methods
            if (shape instanceof Rectangle) {
                System.out.println( ((Rectangle) shape).getLength() );
                rectList.add((Rectangle) shape);
//                ((Rectangle) shape).getLength()
            }
        }
    }
    
}
