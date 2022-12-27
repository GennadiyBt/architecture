package ModelElements;

import ModelElements.BaseClasses.*;

public class Camera {
    
    public Point3D Location;
    public Angle3D Angle;
    

    public Camera(Point3D Location, Angle3D Angle){
        this.Location = Location;
        this.Angle = Angle;
    }

    public void Rotate(Angle3D Angle) {
        Angle = new Angle3D();
    }

    public void Move(Point3D Location) {
        Location = new Point3D();
        
    }
}
