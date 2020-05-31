package task1;

public class vampires implements characters,IFly {
    private String name;

    public vampires(String name){
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
        System.out.println("I'm vampire");

    }
    @Override
    public void fly() {
        System.out.println("I can only fly ");
    }
}
