package task2;

public class Subscribers implements ObserverSubscribers{
    private String name;

    public Subscribers(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(Magazine m) {
        System.out.println(this.name + " got message " + m.getName());
    }
}
