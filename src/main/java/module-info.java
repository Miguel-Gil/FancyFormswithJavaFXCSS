module es.ieslosmontecillos.fancyformswithjavafxcss {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.fancyformswithjavafxcss to javafx.fxml;
    exports es.ieslosmontecillos.fancyformswithjavafxcss;
}