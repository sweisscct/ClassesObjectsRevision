/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classesobjectsrevision;

/**
 *
 * @author celeb
 */

public class Rectangle extends Shape {
    private int length;
    public int width;
    
    public Rectangle (int length, int width) {
        this.length = length;
        this.width = width;
    }
    
    // Method overloading - Kind of like a method polymorphism
    public Rectangle (int length) {
        this.length = length;
        this.width = length;
    }
    
    public int getLength() {
        return length;
    }
    
    
    public int getLength(int length) {return 5;}
    public int getLength(String length) {return 5;}
    public int getLength(int length, String text) {return 5;}
    public int getLength(String length, int text) {return 5;}
    
    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public int getArea() {
        return length * width;
    }
}
