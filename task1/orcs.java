package task1;

public class orcs implements characters, IFlyAndWalk{
    private String name;

    public orcs(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void execute() {
        System.out.println("I'm troll ");
    }
    @Override
    public void FlyAndWalk() {
        System.out.println("I can fly and walk");

    }
}
