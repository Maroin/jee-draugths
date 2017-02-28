package org.isen.draughts.core.pojo;

import org.isen.draughts.core.enums.CellColor;
import org.isen.draughts.core.enums.ChipType;
import org.isen.draughts.core.enums.Player;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by isen on 09/01/2017.
 */
public interface Draughts {
    public final static int COLUMNS_NUMBER = 8;

    java.util.List<java.util.List<DraughtCell>> board = new ArrayList<>(COLUMNS_NUMBER);

    void initEmptyGrid();



     void play(Point point, Point point1, Player colour);
     ArrayList<Point> checkAround(Point point) ;
     boolean getColour() ;

     List<Point> getAllowedMoves(Point origin, Player player);

     ArrayList<Player> getBoard() ;

    /**
     * Returns the cell
     * chip is present.
     * @param point
     * @return
     */
     DraughtCell getDraughtCell(Point point) ;
    /**
     * Returns the number of columns.
     * @return
     */
    int getColumnsNumber();

    /**
     * Returns the number of rows.
     * @return
     */
    int getRowsNumber();

}
