
public class SudokuSolver {
    private static void solve(int[][] sudoku, int index) {
        if (index == sudoku.length * sudoku.length) {
            System.out.println("Sudoku solved!");
            printSudoku(sudoku);
        }
        else {
            int row = index / sudoku.length;
            int col = index % sudoku.length;
            if (sudoku[row][col] != 0)
            {
                solve(sudoku, index + 1);
            }
            else {
                for (int pos = 1; pos <= sudoku.length; pos++) {
                    if (possibleBoard(sudoku, row, col, pos)) {
                        sudoku[row][col] = pos;
                        solve(sudoku, index + 1);
                        sudoku[row][col] = 0;
                    }
                }
            }
        }
    }
    public static void solveSudoku(int[][] sudoku) {
        if (sudoku == null || sudoku.length == 0 || sudoku.length != sudoku[0].length) {
            throw new IllegalArgumentException("Sudoku board must be square and not null.");
        }
        solve(sudoku, 0);
    }
    public static void printSudoku(int[][] sudoku) {
        for (int r = 0; r < sudoku.length; r++) {
            for (int c = 0; c < sudoku[0].length; c++) {
                System.out.print(sudoku[r][c] + " ");
            }
            System.out.println();
        }
    }
    private static boolean possibleBoard(int[][] sudoku, int row, int col, int pos) {
        //check row
        for (int c = 0; c < sudoku[0].length; c++) {
            if (sudoku[row][c] == pos) {
                return false;
            }
        }
        //check column
        for (int r = 0; r < sudoku.length; r++) {
            if (sudoku[r][col] == pos) {
                return false;
            }
        }
        //check 3 by 3
        int squareRow = row - row % 3;
        int squareCol = col - col % 3;
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (sudoku[squareRow + r][squareCol + c] == pos) {
                    return false;
                }
            }
        }
        return true;
    }
}
