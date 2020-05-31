package task2;

import java.util.ArrayList;

public class Postal_office implements ObserverPostalOffice{
    private Magazine current;
    ArrayList<Subscribers> subscribers;


    public Postal_office(Magazine current) {
        this.current = current;
        this.subscribers = new ArrayList<>();
    }

    public void setCurrent(Magazine current) {
        this.current = current;
    }

    public Magazine getCurrent() {
        return current;
    }

    @Override
    public void subscribe(Subscribers num1) {

    }

    @Override
    public void unsubscribe(Subscribers num1) {

    }

    @Override
    public void update(Magazine x) {
        this.current = x;
        send();
    }

    @Override
    public void send() {
        for (Subscribers num1: subscribers){
            num1.update(current);
        }
    }

}