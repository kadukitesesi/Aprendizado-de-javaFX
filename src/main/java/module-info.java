module com.kadukitesesi.quentinhas {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires java.desktop;

    opens com.kadukitesesi.quentinhas to javafx.fxml;
    opens com.kadukitesesi.layout to javafx.fxml;
    exports com.kadukitesesi.quentinhas;
    exports com.kadukitesesi.layout;
}