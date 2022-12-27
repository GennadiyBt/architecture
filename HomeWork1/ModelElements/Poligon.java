package ModelElements;

import java.util.ArrayList;

import ModelElements.BaseClasses.Point3D;

class Poligon {  

    public ArrayList<Point3D> Points = new ArrayList<Point3D>(null);

    public Poligon(Point3D Point){
        Points.add(Point);
    }
    
}
