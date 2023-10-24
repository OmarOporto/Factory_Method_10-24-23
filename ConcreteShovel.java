public class ConcreteShovel extends Excavate{

    @Override
    public Tool usingTool() {
        return new ProductShovel();
    }
}
