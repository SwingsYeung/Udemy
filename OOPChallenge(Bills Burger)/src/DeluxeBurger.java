public class DeluxeBurger extends Hamburger{
    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 14.54, "White");
        super.addHambugerAdditon1("Chips", 2.75);
        super.addHambugerAdditon2("Drink", 1.81);
    }

    @Override
    public void addHambugerAdditon1(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHambugerAdditon2(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHambugerAdditon3(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");    }

    @Override
    public void addHambugerAdditon4(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");    }
}
