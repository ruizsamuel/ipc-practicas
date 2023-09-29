package practica2;

import javafx.scene.layout.GridPane;

public class GridUtils {

    public static int columnCalc(GridPane grid, double x) {
        int celdaWidth = (int) (grid.getWidth() / grid.getColumnCount());
        return (int) (x / celdaWidth);
    }

    public static int rowCalc(GridPane grid, double y) {
        int celdaHeight = (int) (grid.getHeight() / grid.getRowCount());
        return (int) (y / celdaHeight);
    }

    public static int rowNorm(GridPane grid, int row) {
        int rowCount = grid.getRowCount();
        return (row + rowCount) % rowCount;
    }

    public static int columnNorm(GridPane grid, int col) {
        int colCount = grid.getColumnCount();
        return (col + colCount) % colCount;
    }
}