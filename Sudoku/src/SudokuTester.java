
public class SudokuTester {
    public static void main (String[] args) {
        int[][] sudokuBoard= new int[][] {{ 0, 7, 2, 5, 0, 0, 0, 0, 0}, 
                                          { 0, 3, 0, 0, 0, 4, 0, 0, 0},
                                          { 0, 0, 0, 0, 0, 2, 0, 1, 0},
                                          { 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                          { 0, 0, 4, 7, 3, 0, 0, 0, 0},
                                          { 1, 5, 7, 0, 0, 0, 0, 0, 0},
                                          { 9, 0, 8, 0, 0, 0, 5, 0, 0},
                                          { 0, 0, 0, 0, 0, 0, 4, 2, 0},
                                          { 0, 0, 0, 9, 0, 0, 3, 7, 0}};
        SudokuSolver.solveSudoku(sudokuBoard);
    }
}
