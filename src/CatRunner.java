public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Timmy", 13, 16.75);
        cat1.introduce();
        cat1.printCatInfo();
        Cat cat2 = new Cat("Oreo", 6, 14);
        cat2.printCatInfo();
        cat2.introduce();

    }
}
