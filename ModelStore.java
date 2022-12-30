public class ModelStore{
    public Models PoligonalModel;
    public Scenes Scene;
    public Flashes Flash;
    public Cameras Camera;
    private cangeObserves IModelChangeObserver;

    public Scenes getScene() {
        return Scene;
    }

    public void NotifyCange(IModelCanger){};



}
