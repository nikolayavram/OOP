public class Main {
    public static void main(String[] args) {
        
        System.out.println();
        Duck krjak = new Duck("Krjak", "gray", 2, "duck", true, true, true);
        krjak.toRun();
        krjak.toFly();
        krjak.toSwim();
        System.out.println();

        Cat barsik = new Cat("Barsik", "white", 3, true, "bengal", 4, "cat", true, false, false);
        barsik.toRun();
        barsik.toFly();
        barsik.toSwim();
        System.out.println();

        Dog barbos = new Dog("Barbos", "black", 10, false, "pudel", 4, "dog", true, false, true);
        barbos.toRun();
        barbos.toFly();
        barbos.toSwim();
        System.out.println();
    }
}