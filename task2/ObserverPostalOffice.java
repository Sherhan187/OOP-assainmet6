package task2;

public interface ObserverPostalOffice {
     void subscribe(Subscribers num1);
     void unsubscribe(Subscribers num1);
     void update(Magazine x);
     void send();
}
