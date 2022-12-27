package ModelElements;

import java.util.ArrayList;

import ModelElements.BaseClasses.Point3D;

public class PoligonalModel {
    
    public ArrayList<Poligon> Poligons = new ArrayList<Poligon>();
    public Texture Textures;


    public PoligonalModel(Texture Textures){
        this.Textures = Textures;
        Poligons.add(new Poligon(new Point3D()));
    }
}
