package midterm.kamil_nuriev_1.task3;

public class storageTester {
    public static void main(String[] args) {
        Coffee c1 = new Coffee();
        c1.setName("Arabica");
        c1.setWeight(1453);

        Coffee c2 = new Coffee();
        c2.setName("Robusta");
        c2.setWeight(1991);

        Coffee c3 = new Coffee();
        c3.setName("Brazil");
        c3.setWeight(2000);

        CBMS cbms = new CBMS();
        cbms.addCoffee(c1);
        cbms.addCoffee(c2);
        cbms.addCoffee(c3);

        cbms.removeCoffee(c2);

        cbms.setWeight("Arabica", 2001);

        cbms.printStorage();
    }
}
