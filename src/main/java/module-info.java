module com.mycompany.robustezpersistenciadedatos {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.robustezpersistenciadedatos to javafx.fxml;
    exports com.mycompany.robustezpersistenciadedatos;
}
