public class Hamburger {
    private String name;
    private String breadRollType;
    private double price;
    private String meat;

    private String addtion1Name;
    private double addtion1Price;

    private String addtion2Name;
    private double addtion2Price;

    private String addtion3Name;
    private double addtion3Price;

    private String addtion4Name;
    private double addtion4Price;

    public Hamburger(String name, String breadRollType, double price, String meat) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.price = price;
        this.meat = meat;
    }

    public void addHambugerAdditon1(String name, double price){
        this.addtion1Name =name;
        this.addtion1Price = price;
    }

    public void addHambugerAdditon2(String name, double price){
        this.addtion2Name =name;
        this.addtion2Price = price;
    }

    public void addHambugerAdditon3(String name, double price){
        this.addtion3Name =name;
        this.addtion3Price = price;
    }

    public void addHambugerAdditon4(String name, double price){
        this.addtion4Name =name;
        this.addtion4Price = price;
    }

    public double itemizeHamburger(){
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger " + " on a " + this.breadRollType + " roll "
                +"with " + this.meat + ", price is " + this.price);
        if (this.addtion1Name != null){
            hamburgerPrice += this.addtion1Price;
            System.out.println("Added " + this.addtion1Name + " for an extra " + this.addtion1Price );
        }

        if (this.addtion2Name != null){
            hamburgerPrice += this.addtion2Price;
            System.out.println("Added " + this.addtion2Name + " for an extra " + this.addtion2Price );
        }

        if (this.addtion3Name != null){
            hamburgerPrice += this.addtion3Price;
            System.out.println("Added " + this.addtion3Name + " for an extra " + this.addtion3Price );
        }

        if (this.addtion4Name != null){
            hamburgerPrice += this.addtion4Price;
            System.out.println("Added " + this.addtion4Name + " for an extra " + this.addtion4Price );
        }

        return hamburgerPrice;
    }

    public String getName() {
        return name;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public double getPrice() {
        return price;
    }

    public String getMeat() {
        return meat;
    }

    public String getAddtionsPrice(String addtions) {
        switch (addtions){
            case "lettuce":
                addtions += 0.75;
            case "tomato":
                addtions += 1;
            case "carrot":
                addtions += 1;
            case "pickle":
                addtions += 0.8;
        }
        return addtions;
    }

    public double getAddtionsPrice(double addtions){
        return addtions;
    }

    public double getFinalPrice(double price,double addtions){
        double finalPrice = price + addtions;
        return finalPrice;
    }
}



