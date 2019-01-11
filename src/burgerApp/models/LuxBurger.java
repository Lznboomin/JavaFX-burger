package burgerApp.models;

public class LuxBurger extends Burger {

    public LuxBurger() {
        super("Lux", "veise", "valge", 10.0);
        super.valiLisand1("friikartulid", 2.5);
        super.valiLisand2("jook", 1.5);
    }

    @Override
    public void valiLisand1(String nimetus, double hind) {
        System.out.println("Lux burgerile ei saa lisandeid lisada");
    }

    @Override
    public void valiLisand2(String nimetus, double hind) {
        System.out.println("Lux burgerile ei saa lisandeid lisada");
    }

    @Override
    public void valiLisand3(String nimetus, double hind) {
        System.out.println("Lux burgerile ei saa lisandeid lisada");
    }

    @Override
    public void valiLisand4(String nimetus, double hind) {
        System.out.println("Lux burgerile ei saa lisandeid lisada");
    }
}
