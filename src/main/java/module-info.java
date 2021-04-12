module io.github.spicykitten.modular_spring_fx {
    requires javafx.controls;
    requires javafx.fxml;

    opens io.github.spicykitten.modular_spring_fx to javafx.fxml;
    exports io.github.spicykitten.modular_spring_fx;
}