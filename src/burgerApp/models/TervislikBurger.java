package burgerApp.models;

public class TervislikBurger extends Burger {

    private String tervislikLisand1;
    private String tervislikLisand2;
    private String tervislikLisand3;
    private String tervislikLisand4;
    private String tervislikLisand5;
    private String tervislikLisand6;

    public TervislikBurger(String liha, double hind) {
        super("Tervislik", liha, "must teraleib", 5.0);
    }

    public void valiTervislikLisand1(String name) {
        this.tervislikLisand1 = name;
    }

    public void valiTervislikLisand2(String name) {
        this.tervislikLisand2 = name;
    }

    public void valiTervislikLisand3(String name) {
        this.tervislikLisand3 = name;
    }

    public void valiTervislikLisand4(String name) {
        this.tervislikLisand4 = name;
    }

    public void valiTervislikLisand5(String name) {
        this.tervislikLisand5 = name;
    }

    public void valiTervislikLisand6(String name) {
        this.tervislikLisand6 = name;
    }

    @Override
    public double koostaBurger() {
        double burgeriHind = super.koostaBurger();
        if (tervislikLisand1 != null ){
            burgeriHind += 0.8;
            System.out.println("Lisati " + tervislikLisand1 + ", hinnale lisandub 0.8");
        }
        if (tervislikLisand2 != null) {
            burgeriHind += 0.8;
            System.out.println("Lisati " + tervislikLisand2 + ", hinnale lisandub 0.8");
        }
        if (tervislikLisand3 != null) {
            burgeriHind += 0.9;
            System.out.println("Lisati " + tervislikLisand3 + ", hinnale lisandub 0.9");
        }
        if (tervislikLisand4 != null) {
            burgeriHind += 0.9;
            System.out.println("Lisati " + tervislikLisand4 + ", hinnale lisandub 0.9");
        }
        if (tervislikLisand5 != null) {
            burgeriHind += 1.0;
            System.out.println("Lisati " + tervislikLisand5 + ", hinnale lisandub 1.0");
        }
        if (tervislikLisand6 != null) {
            burgeriHind += 1.0;
            System.out.println("Lisati " + tervislikLisand6 + ", hinnale lisandub 1.0");
        }
        return burgeriHind;
    }
}
