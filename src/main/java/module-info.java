module com.ingeniom22 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.ingeniom22 to javafx.fxml;

    exports com.ingeniom22;

    opens com.ingeniom22.controller to javafx.fxml;

    exports com.ingeniom22.controller;
}
