public class Hamburger {

    private String name;
    private String breadType;
    private String meat;
    private double price;

    private String additionaleItem1;
    private double additionalPrice1;

    private String additionaleItem2;
    private double additionalPrice2;

    private String additionaleItem3;
    private double additionalPrice3;

    private String additionaleItem4;
    private double additionalPrice4;

    //This constructor has the base variablews that a hamburger should contain
    public Hamburger(String name, String breadType, String meat, double price) {
        this.name = name;
        this.breadType = breadType;
        this.meat = meat;
        this.price = price;
    }

    //We need a mechanism to add those additions  therfore we need a method to do so.

    public void addHamburgerAddition1(String name,double price){
        this.additionaleItem1 = name ;
        this.additionalPrice1 = price;
    }

    public void addHamburgerAddition2(String name,double price){
        this.additionaleItem2 = name ;
        this.additionalPrice2 = price;
    }
    public void addHamburgerAddition3(String name,double price){
        this.additionaleItem3 = name ;
        this.additionalPrice3 = price;
    }
    //Additinal item for the burger, the this keywords points to the attribute of the hamburger you wan tto give it to.
    public void addHamburgerAddition4(String name,double price){
        this.additionaleItem4 = name ;
        this.additionalPrice4 = price;
    }

    public double itemedHamburger(){
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger " + " on a " + this.breadType + " roll " +
                " price is " + this.price);
        if(this.additionaleItem1 != null){
            hamburgerPrice += this.additionalPrice1;
            System.out.println("Added " + this.additionaleItem1 + " for an extra " + additionalPrice1);

        }
        if(this.additionaleItem2 != null){
            hamburgerPrice += this.additionalPrice2;
            System.out.println("Added " + this.additionaleItem2 + " for an extra " + additionalPrice2);

        }
        if(this.additionaleItem3 != null){
            hamburgerPrice += this.additionalPrice3;
            System.out.println("Added " + this.additionaleItem3 + " for an extra " + additionalPrice3);

        }
        if(this.additionaleItem4 != null){
            hamburgerPrice += this.additionalPrice4;
            System.out.println("Added " + this.additionaleItem4 + " for an extra " + additionalPrice4);

        }
        return hamburgerPrice;
    }
}
