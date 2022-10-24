module io.asbun.extracreditcomboboxandslider {
    requires javafx.controls;
    requires javafx.fxml;


    opens io.asbun.extracreditcomboboxandslider to javafx.fxml;
    exports io.asbun.extracreditcomboboxandslider;
}