import sun.awt.image.codec.JPEGParam;

import javax.swing.*;
import java.awt.*;

/**
 * GUI for the Equable Solver
 */
public class EquableSolverGUI {

    private JLabel scoreLabel;
    private JPanel centrePanel;
    private JPanel grid;

    public EquableSolverGUI() {
        JFrame frame = new JFrame("Map");
        frame.setLayout(new BorderLayout());

        JPanel northPanel = new JPanel();
        scoreLabel = new JLabel("Score: ");
        northPanel.add(scoreLabel);
        frame.add(northPanel, BorderLayout.NORTH);

        centrePanel = new JPanel();
        grid = new JPanel();
        centrePanel.add(grid);
        grid.setLayout(new GridLayout(Config.BOARD_SIZE, Config.BOARD_SIZE));

        frame.add(centrePanel, BorderLayout.CENTER);

        JPanel southPanel = new JPanel();
        JTextField handField = new JTextField();
        handField.setColumns(20);
        southPanel.add(handField);
        frame.add(southPanel, BorderLayout.SOUTH);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void updateScore(int score) {
        scoreLabel.setText("Score: " + score);
    }

    public void updateBoard(Board board) {
        centrePanel.remove(0);
        int size = board.getBoardSize();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                BoardSquare square = board.getSquare(i,j);
            }
        }
    }
}