public class HealthyBurger extends Hamburger{
    private boolean jalapeno;
    private boolean cheese;

    public HealthyBurger(Addition addition, boolean jalapeno, boolean cheese) {
        super("Sağlıklı Burger", "Çavdar", "Tavuk", addition);
        this.jalapeno = jalapeno;
        this.cheese = cheese;
    }

    @Override
    public void createBurger() {
        String burgerName = super.getBurgerName();
        String rollType = super.getRollType();
        String meat = super.getMeat();
        double price = super.getPrice();

        System.out.println(burgerName + " siparişi alındı. " +
                "\r\nİçeriğinde leziz " + rollType +" ekmeği ve "+
                meat +" etiyle "+ "hemen hazırlanıyor.");
        if (this.addition.isLettuce()){
            System.out.println("Ekstra olarak marul ");
            price = price + 0.35;
        }
        if (this.addition.isOnion()) {
            System.out.println("Ekstra olarak soğan ");
            price = price + 0.5;
        }
        if (this.addition.isTomato()) {
            System.out.println("Ekstra olarak domates ");
            price = price + 0.45;
        }
        if (this.addition.isPickle()) {
            System.out.println("Ekstra olarak turşu ");
            price = price + 0.65;
        }
        if (this.cheese) {
            System.out.println("Ekstra olarak peynir ");
            price = price + 0.40;
        }
        if (this.jalapeno) {
            System.out.println("Ekstra olarak acı biber ");
            price = price + 0.40;
        }
        System.out.println("Fiyatı: " + price + "₺");
    }

    public boolean isJalapeno() {
        return jalapeno;
    }

    public boolean isCheese() {
        return cheese;
    }
}
