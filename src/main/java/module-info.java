module com.jojoidu.book.freelecspringboot2webservice {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.jojoidu.book.freelecspringboot2webservice to javafx.fxml;
    exports com.jojoidu.book.freelecspringboot2webservice;
}