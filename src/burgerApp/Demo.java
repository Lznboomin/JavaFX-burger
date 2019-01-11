package burgerApp;

import burgerApp.models.Burger;
import burgerApp.models.LuxBurger;
import burgerApp.models.TervislikBurger;

public class Demo {

    public static void main(String[] args) {

//        Burger burger = new Burger("Tavaline", "kana","valge", 3.5);
//        burger.valiLisand1("tomat",0.2);
//        burger.valiLisand2("juust", 0.75);
//        burger.valiLisand3("kurk",0.5);
//        burger.valiLisand4("topelt liha", 2);
//        System.out.println("Burgeri lõplik hind on " + burger.koostaBurger());

//        System.out.println("=================");
//
//        TervislikBurger tervislikBurger = new TervislikBurger("kana", 4);
//        tervislikBurger.valiTervislikLisand1("kana");
//        tervislikBurger.valiTervislikLisand2("pulli munad");
//        tervislikBurger.valiTervislikLisand3("tomat");
//        tervislikBurger.valiTervislikLisand4("jahu");
//        tervislikBurger.valiTervislikLisand5("kurk");
//        tervislikBurger.valiTervislikLisand6("karri");
//        System.out.println("Burgeri lõplik hind on " + tervislikBurger.koostaBurger());
//
//        System.out.println("=================");
//
//        LuxBurger luxBurger = new LuxBurger();
//        System.out.println("Burgeri lõplik hind on " + luxBurger.koostaBurger());
        LuxBurger luxBurger = new LuxBurger();
        System.out.println("Maksab " + luxBurger.koostaBurger());

    }
}
