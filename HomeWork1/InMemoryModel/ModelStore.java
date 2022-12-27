package InMemoryModel;

import java.util.ArrayList;

import ModelElements.*;

public class ModelStore implements IModelChanger {
    public ArrayList<PoligonalModel> Models = new ArrayList<>();
    public ArrayList<Scene> Scenes = new ArrayList<Scene>();
    public ArrayList<Flash> Flashes = new ArrayList<Flash>();
    public ArrayList<Camera> Cameras = new ArrayList<Camera>();
    private ArrayList<IModelChangedObserver> changedObservers = new ArrayList<>(null);


    public ModelStore(Texture Textures){
        Models.add(new PoligonalModel(Textures));
        Scenes.add(new Scene(null, null));
        Flashes.add(new Flash(null, null, null, null));
        Cameras.add(new Camera(null, null));
    }

    @Override
    public void NotifyChange(IModelChanger sender) {
        // TODO Auto-generated method stub
        
    }

    public Scene getScene(int ScenNum) {

        return Scenes.get(ScenNum);
    }
}
