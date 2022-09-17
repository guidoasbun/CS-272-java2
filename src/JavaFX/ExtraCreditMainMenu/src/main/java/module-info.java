module io.asbun.extracreditmainmenu {
    requires javafx.controls;
    requires javafx.fxml;


    opens io.asbun.extracreditmainmenu to javafx.fxml;
    exports io.asbun.extracreditmainmenu;
}