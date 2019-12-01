module ksh.openjfx.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;
	requires cdi.api;
	requires javax.inject;

    opens ksh.openjfx.example to javafx.fxml;
    //opens org.openjfx.hellofx.service to javafx.fxml;
    opens ksh.openjfx.example.view to javafx.fxml;
    
    exports ksh.openjfx.example;
    exports ksh.openjfx.example.service;
    exports ksh.openjfx.example.view;
}