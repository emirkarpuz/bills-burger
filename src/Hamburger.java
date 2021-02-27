public class Hamburger {
    private String burgerName;  //Basic, Healthy, Deluxe
    private String rollType;    //White, Brown rye
    private String meat;        //Sausage, Chicken
    Addition addition;          //Lettuce, Onion, Tomato, Pickle
    private double price = 3.95;       //Basic = 3.95$ Addition's = 1.75$

    public Hamburger(String burgerName, String rollType, String meat, Addition addition) {
        this.burgerName = burgerName;
        this.rollType = rollType;
        this.meat = meat;
        this.addition = addition;
    }

    public void createBurger() {
        System.out.println(this.burgerName + " siparişi alındı. " +
                           "\r\nİçeriğinde leziz " + this.rollType +" ekmeği ve "+
                           this.meat +" etiyle "+ "hemen hazırlanıyor.");
        if (this.addition.isLettuce()){
            System.out.println("Ekstra olarak marul ");
            this.price = this.price + 0.35;
        }
        if (this.addition.isOnion()) {
            System.out.println("Ekstra olarak soğan ");
            this.price = this.price + 0.5;
        }
        if (this.addition.isTomato()) {
            System.out.println("Ekstra olarak domates ");
            this.price = this.price + 0.45;
        }
        if (this.addition.isPickle()) {
            System.out.println("Ekstra olarak turşu ");
            this.price = this.price + 0.65;
        }
        System.out.println("Fiyatı: " + this.price + "₺");
    }

    public String getBurgerName() {
        return burgerName;
    }

    public String getRollType() {
        return rollType;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }
}
