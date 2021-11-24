module edu.neu.zequn.view {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;
    requires javafx.swing;
    requires org.apache.commons.io;
    requires javaxt.core;

    opens edu.neu.zequn.view to javafx.fxml;
    exports edu.neu.zequn.view;
    exports edu.neu.zequn.control;
    opens edu.neu.zequn.control to javafx.fxml;
}