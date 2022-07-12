public class DeluxBurger extends Hamburger{
    public DeluxBurger() {
        //Customizing burger to its default settings from the superclass
        super("Deluxe", "White bread", "Sausage and Bacon", 14.54);
        //Adding additional items that the delux Burger would come with
        super.addHamburgerAddition1("Chips",2.75);
        super.addHamburgerAddition2("Drink",1.81);
    }

    //IN ORDER TO PREVENT ADDED ITEMS FOR THE DELUX BURGER ONLY YOU WOULD HAVE TO OVERRIDE THE METHODS FROM THE PREVIOUS CLASSES
    //AND CHABGE THE CODE WITHIN THE OVERIDDEN METHODS

    public DeluxBurger(String name, String breadType, String meat, double price) {
        super(name, breadType, meat, price);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to a Deluxe burger.");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to a Deluxe burger.");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to a Deluxe burger.");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to a Deluxe burger.");
    }


}
