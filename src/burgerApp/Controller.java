package burgerApp;

import burgerApp.models.Burger;
import burgerApp.models.LuxBurger;
import burgerApp.models.TervislikBurger;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;

import java.util.Map;

public class Controller {
    @FXML
    private TextField extra1;
    @FXML
    private TextField extra2;
    @FXML
    private TextField extra3;
    @FXML
    private TextField extra4;
    @FXML
    private TextField healthyExtra1;
    @FXML
    private TextField healthyExtra2;
    @FXML
    private TextField healthyExtra3;
    @FXML
    private TextField healthyExtra4;
    @FXML
    private TextField healthyExtra5;
    @FXML
    private TextField healthyExtra6;
    @FXML
    private ToggleGroup burgerToggleGroup;

    private Burger burger = new Burger("Tavaline", "kana", "valge", 3.50);
    private TervislikBurger healthyBurger = new TervislikBurger("vegan-pasteet", 5.0);
    private LuxBurger luxBurger = new LuxBurger();

    public void sendOrder() {
        System.out.println("Tellimus vastu võetud!");
    }

    public void detectOption() {
        burgerToggleGroup.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            public void changed(ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) {

                if (burgerToggleGroup.getSelectedToggle() != null) {
                    String burgerType = burgerToggleGroup.getSelectedToggle().getUserData().toString();

                    if (burgerType.equals("TavalineBurger")) {
                        createRegularBurger();

                    } else if (burgerType.equals("TervislikBurger")) {
                        createHealthyBurger();

                    } else if (burgerType.equals("LuxBurger")) {
                        createLuxBurger();
                    }
                }
            }
        });
    }

    public void createRegularBurger() {
        burger.koostaBurger();
        if (!extra1.getText().trim().isEmpty()) {
            burger.valiLisand1(extra1.getText(), 0.5);
            System.out.println("Teie arve on " + burger.koostaBurger() + "€");
        }
        if (!extra2.getText().trim().isEmpty()) {
            burger.valiLisand2(extra2.getText(), 0.6);
            System.out.println("Teie arve on " + burger.koostaBurger() + "€");
        }
        if (!extra3.getText().trim().isEmpty()) {
            burger.valiLisand3(extra3.getText(), 0.7);
            System.out.println("Teie arve on " + burger.koostaBurger() + "€");
        }
        if (!extra4.getText().trim().isEmpty()) {
            burger.valiLisand4(extra4.getText(), 0.8);
            System.out.println("Teie arve on " + burger.koostaBurger() + "€");
        }
    }

    public void createHealthyBurger() {
        healthyBurger.koostaBurger();
        if (!healthyExtra1.getText().trim().isEmpty()) {
            healthyBurger.valiTervislikLisand1(healthyExtra1.getText());
            System.out.println("Teie arve on " + healthyBurger.koostaBurger() + "€");
        }
        if (!healthyExtra2.getText().trim().isEmpty()) {
            healthyBurger.valiTervislikLisand2(healthyExtra2.getText());
            System.out.println("Teie arve on " + healthyBurger.koostaBurger() + "€");
        }
        if (!healthyExtra3.getText().trim().isEmpty()) {
            healthyBurger.valiTervislikLisand3(healthyExtra3.getText());
            System.out.println("Teie arve on " + healthyBurger.koostaBurger() + "€");
        }
        if (!healthyExtra4.getText().trim().isEmpty()) {
            healthyBurger.valiTervislikLisand4(healthyExtra4.getText());
            System.out.println("Teie arve on " + healthyBurger.koostaBurger() + "€");
        }
        if (!healthyExtra5.getText().trim().isEmpty()) {
            healthyBurger.valiTervislikLisand5(healthyExtra5.getText());
            System.out.println("Teie arve on " + healthyBurger.koostaBurger() + "€");
        }
        if (!healthyExtra6.getText().trim().isEmpty()) {
            healthyBurger.valiTervislikLisand6(healthyExtra6.getText());
            System.out.println("Teie arve on " + healthyBurger.koostaBurger() + "€");
        }
    }

    public void createLuxBurger() {
        System.out.println("Lux burgeri kogu maksumus koos friikartulite ja joogiga on " + luxBurger.koostaBurger() + "€");
    }

    public void initialize() {
        detectOption();
    }


}
