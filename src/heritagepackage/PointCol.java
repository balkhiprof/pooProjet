/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heritagepackage;

/**
 *
 * @author Balkhi
 */
public class PointCol extends Point{
    private float couleur;

    public PointCol(int x, int y) {
        super(x, y);
    }

    public PointCol(int x, int y,float couleur) {
        super(x, y);
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        return "PointCol{" + "couleur=" + couleur + '}';
    }
    
    
    
}
