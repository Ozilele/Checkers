module checkers.game.checkersgame {
  requires javafx.controls;
  requires javafx.fxml;

  requires org.controlsfx.controls;

  opens checkers.game.checkersgame to javafx.fxml;
  exports checkers.game.checkersgame;
}