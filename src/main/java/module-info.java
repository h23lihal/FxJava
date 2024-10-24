module com.example.tjabbatjenahallo {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    exports com.example.tjabbatjenahallo;

    // Lägg till detta för att ge åtkomst till javafx.fxml så att FXML kan komma åt kontroller i HelloController
    opens com.example.tjabbatjenahallo to javafx.fxml;
}
