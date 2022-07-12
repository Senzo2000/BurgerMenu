public class HealthyBurger extends Hamburger {

    private String healthyName;
    private double healthyPrice;

    private String healthyName2;
    private double healthyPrice2;

    public HealthyBurger( String meat, double price) {
        super("Healthy", "Brown Rye", meat, price);

    }

    public void addHealth1(String name, double price){
        this.healthyName = name;
        this.healthyPrice = price;
    }
    public void addHealth2(String name, double price){
        this.healthyName2 = name;
        this.healthyPrice2 = price;
    }

    @Override
    public double itemedHamburger() {
        double HamburgerPrice =  super.itemedHamburger();
        if( this.healthyName != null){
            HamburgerPrice += this.healthyPrice;
            System.out.println("Added " + this.healthyName + "for an extra " + this.healthyPrice);
        }
        if( this.healthyName2 != null){
            HamburgerPrice += this.healthyPrice2;
            System.out.println("Added " + this.healthyName2 + "for an extra " + this.healthyPrice2);
        }
        return HamburgerPrice;
    }
}
