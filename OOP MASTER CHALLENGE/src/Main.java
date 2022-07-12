public class Main {
    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic","WhiteRoll", "Sausage",3.65);
        double price = hamburger.itemedHamburger();
        hamburger.addHamburgerAddition1("Lettuce ",0.7);
        hamburger.addHamburgerAddition2("Tomatoe ",0.77);
        hamburger.addHamburgerAddition3(" cheese ",1.12);
        //ItemedHamBurger is a method that collects all the prices and names from the hamburger object
        System.out.println("Total Hamburger price is : "+ hamburger.itemedHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon",5.67);
        healthyBurger.addHamburgerAddition1("Egg",5.43);
        healthyBurger.addHamburgerAddition1("Lentiles", 3.41);
        System.out.println("Total healthy burger price is " +healthyBurger.itemedHamburger());

        DeluxBurger db = new DeluxBurger();
        db.itemedHamburger();
        System.out.println("");



    }

}
