package ModelElements;

import java.util.ArrayList;

public class Scene {
    
    public int id;
    public ArrayList<PoligonalModel> Models = new ArrayList<PoligonalModel>();
    public ArrayList<Flash> Flashes = new ArrayList<Flash>();
    public ArrayList<Camera> Cameras = new ArrayList<Camera>(null);

    public Scene(PoligonalModel Model, Camera Camera){
        Models.add(Model);
        Cameras.add(Camera);
    }

    public ArrayList<PoligonalModel> method1(ArrayList<PoligonalModel>Models) {
        return Models;
    }

    public ArrayList<Flash> method2(int id, ArrayList<Flash> Flashes) {
        return Flashes;
    }
}
