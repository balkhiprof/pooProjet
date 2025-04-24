/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heritagepackage;

/**
 *
 * @author Balkhi
 */
public class Point {
    //variables d'instances
    protected int x , y;
    //4 types d'encapsulation sous java
    //public
    //private
    //protected
    //package
    //Construteurs

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    //Getters and setters

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    //méthode d'affichege
    public void affichage(){
        System.out.println("x="+x+"  y="+y);
    }

    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }
    
   
    
}
