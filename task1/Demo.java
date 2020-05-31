package task1;

public class Demo {
    public static void main(String[] args) {
        context context= new context(new orcs("Orcs"));
        context.demo();

        context = new context(new vampires("Vampire"));
        context.demo();

        context = new context(new pegasus("Peqas"));
        context.demo();
}
}
