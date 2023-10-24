public class Main {
    static Excavate excavate;

    public static void main(String[] args) {
        System.out.println("First we need to use the machines");
        configure("Excavator");
        startDigging();

        System.out.println("---------------------------------------------------------------------------");

        System.out.println("then we use the manual workers");
        configure("Shovel or something");
        startDigging();
    }
    static void configure(String selected) {
        if(selected.equals("Excavator")) {
            excavate =  new ConcreteExcavator();
        }
        else {
            excavate = new ConcreteShovel();
        }
    }
    static void startDigging() {
        System.out.println(excavate.usingTool().dig());
    }
}
