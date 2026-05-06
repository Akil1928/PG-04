module ucr.lab.pg04 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ucr.lab.pg04 to javafx.fxml;
    exports ucr.lab.pg04;
}