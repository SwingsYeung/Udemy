public class Main {
    public static void main(String[] args) {
    Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
    double price = hamburger.itemizeHamburger();
    hamburger.addHambugerAdditon1("Tomato",0.27);
    hamburger.addHambugerAdditon2("Lettuce",0.75);
    hamburger.addHambugerAdditon3("Cheese",1.13);
        System.out.println("Total burger price is " + hamburger.itemizeHamburger());

    HealthyBurger healthyBurger = new HealthyBurger(5.67,"Bacon");
    healthyBurger.itemizeHamburger();
    healthyBurger.addHambugerAdditon1("Egg",5.43) ;
    healthyBurger.addHealthAddtion1("Lentils", 3.41);
    healthyBurger.itemizeHamburger();
        System.out.println("Total Healthy Burger price is " + healthyBurger.itemizeHamburger());

    DeluxeBurger deluxeBurger = new DeluxeBurger();
    deluxeBurger.addHambugerAdditon1("Should not do this", 5.5);
    deluxeBurger.itemizeHamburger();
    }


}


