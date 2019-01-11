package burgerApp.models;

public class Burger {
    private String nimetus;
    private String liha;
    private String sai;
    private double hind;

    private String lisand1;
    private double lisand1Hind;

    private String lisand2;
    private double lisand2Hind;

    private String lisand3;
    private double lisand3Hind;

    private String lisand4;
    private double lisand4Hind;

    public Burger(String nimetus, String liha, String sai, double hind) {
        this.nimetus = nimetus;
        this.liha = liha;
        this.sai = sai;
        this.hind = hind;
    }

    public void valiLisand1(String nimetus, double hind) {
        this.lisand1 = nimetus;
        this.lisand1Hind= hind;
    }
    public void valiLisand2(String nimetus, double hind) {
        this.lisand2 = nimetus;
        this.lisand2Hind = hind;
    }
    public void valiLisand3(String nimetus, double hind) {
        this.lisand3 = nimetus;
        this.lisand3Hind = hind;
    }
    public void valiLisand4(String nimetus, double hind) {
        this.lisand4 = nimetus;
        this.lisand4Hind = hind;
    }

    public double koostaBurger() {
        double burgeriHind = this.hind;
        System.out.println(this.nimetus + " burger " + "koos " + this.liha + " liha ja " + this.sai + " saiaga " + "maksab " + this.hind);
        if (this.lisand1 != null) {
            burgeriHind += 0.5;
            System.out.println("Lisati " + this.lisand1 + ", hinnale lisandub 0.5");
        }
        if (this.lisand2 != null) {
            burgeriHind += 0.6;
            System.out.println("Lisati " + this.lisand2 + ", hinnale lisandub 0.6");
        }
        if (this.lisand3 != null) {
            burgeriHind += 0.7;
            System.out.println("Lisati " + this.lisand3 + ", hinnale lisandub 0.7");
        }
        if (this.lisand4 != null) {
            burgeriHind += 0.8;
            System.out.println("Lisati " + this.lisand4 + ", hinnale lisandub 0.8");
        }
        return burgeriHind;


    }
}
