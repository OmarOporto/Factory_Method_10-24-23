public class ConcreteExcavator extends Excavate{

    @Override
    public Tool usingTool() {
        return new ProductExcavator();
    }
}
