package stackqueues;

public class Test {
    public static void main(String[] args) {
        Cat c = new Cat("Nicklas", 10);
        Cat c2 = new Cat("Thomas", 10);
        Cat c3 = new Cat("Simba", 10);

        System.out.println(c.catsInExistence);
        System.out.println(c2.catsInExistence);
        System.out.println(c3.catsInExistence);
    }
}
