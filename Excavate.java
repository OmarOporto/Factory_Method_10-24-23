public abstract class Excavate {
    public void excavating() {
        Tool usedTool = usingTool();
        usedTool.dig();
    }

    public abstract Tool usingTool();
}
