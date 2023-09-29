package practica2;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Circle;

import java.net.URL;
import java.util.ResourceBundle;

public class MoverCirculoController implements Initializable {

    @FXML
    private Circle circulo;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) { }

    @FXML
    private void handleMousePressed(MouseEvent e) {
        GridPane grid = (GridPane) e.getSource();
        int col = GridUtils.columnCalc(grid, e.getSceneX());
        int row = GridUtils.rowCalc(grid, e.getSceneY());

        GridPane.setColumnIndex(circulo, col);
        GridPane.setRowIndex(circulo, row);
    }

    @FXML
    private void handleKeyPressed(KeyEvent e) {
        int[] move = new int[2];
        GridPane grid = (GridPane) e.getSource();

        switch (e.getCode()) {
            case UP -> move[1] = -1;
            case DOWN -> move[1] = 1;
            case LEFT -> move[0] = -1;
            case RIGHT -> move[0] = 1;
            default -> {
                return;
            }
        }

        GridPane.setRowIndex(circulo, GridUtils.rowNorm(grid, GridPane.getRowIndex(circulo) + move[1]));
        GridPane.setColumnIndex(circulo, GridUtils.columnNorm(grid,GridPane.getColumnIndex(circulo) + move[0]));
    }
}