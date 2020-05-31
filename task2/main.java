package task2;

public class main {
    public static void main(String[] args) {
        Postal_office postalOffice = new Postal_office(new Magazine("Vogue"));
        Subscribers sub1 = new Subscribers("David");
        Subscribers sub2 = new Subscribers("Nursultan");

        postalOffice.subscribe(sub1);
        postalOffice.subscribe(sub2);
        postalOffice.send();

        postalOffice.unsubscribe(sub1);
        postalOffice.setCurrent(new Magazine("Good magazine"));
        postalOffice.send();
    }
}
