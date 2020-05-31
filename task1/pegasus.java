package task1;

public class pegasus implements FlyUseMagic, characters {
    private String name;

    public pegasus(String name){
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
        System.out.println("I'm pegas");

    }
    @Override
    public void FlyUseMagic() {
        System.out.println("I can fly using magic");
    }


}
