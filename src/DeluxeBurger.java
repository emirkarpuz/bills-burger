public class DeluxeBurger extends Hamburger{
    private boolean coke;
    private boolean fries;

    public DeluxeBurger() {
        super("Deluxe Burger", "Susamlı Beyaz", "Dana",
                new Addition(false,false,false,false));
        this.coke = true;
        this.fries = true;
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
            System.out.println("Bu burger seçiminde ekstra seçim yapılamaz ");
        }
        if (this.addition.isOnion()) {
            System.out.println("Bu burger seçiminde ekstra seçim yapılamaz ");
        }
        if (this.addition.isTomato()) {
            System.out.println("Bu burger seçiminde ekstra seçim yapılamaz ");
        }
        if (this.addition.isPickle()) {
            System.out.println("Bu burger seçiminde ekstra seçim yapılamaz ");
        }
        if (this.coke) {
            System.out.println("Ekstra olarak patates kızartması");
            price = price + 0.75;
        }
        if (this.fries) {
            System.out.println("Ekstra olarak kola");
            price = price + 0.95;
        }
        System.out.println("Fiyatı: " + price + "₺");
    }
}
