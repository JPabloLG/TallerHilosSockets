module co.edu.uniquindio {
    requires javafx.controls;
    requires javafx.fxml;

    opens co.edu.uniquindio to javafx.fxml;
    exports co.edu.uniquindio;

    opens co.edu.uniquindio.EjercicioHilos;
    exports co.edu.uniquindio.EjercicioHilos;
}
