package Revision.GameOfLife.src;

public class NextGeneration {

    public static void NextGen(int[][] grid, int M, int N) {
        int[][] future = new int[M][N];

        for (int l = 0; l < M; l++) {
            for (int m = 0; m < N; m++) {
                // finding no Of Neighbours that are alive
                int aliveNeighbours = 0;
                for (int i = -1; i <= 1; i++) {
                    for (int j = -1; j <= 1; j++) {
                        if ((l + i >= 0 && l + i < M) && (m + j >= 0 && m + j < N)) {
                            aliveNeighbours += grid[l + i][m + j];
                        }
                    }
                }

                // The cell needs to be subtracted from
                // its neighbours as it was counted before
                aliveNeighbours -= grid[l][m];

                // Implementing the Rules of Life

                // Cell is lonely and dies
                if ((grid[l][m] == 1) && (aliveNeighbours < 2))
                    future[l][m] = 0;

                // Cell dies due to overpopulation
                else if ((grid[l][m] == 1) && (aliveNeighbours > 3))
                    future[l][m] = 0;

                // A new cell is born
                else if ((grid[l][m] == 0) && (aliveNeighbours == 3))
                    future[l][m] = 1;

                // Remains the same
                else
                    future[l][m] = grid[l][m];
            }
        }
        // Update the original grid with the new values
        //https://www.geeksforgeeks.org/system-arraycopy-in-java/
        for (int i = 0; i < M; i++) {
            System.arraycopy(future[i], 0, grid[i], 0, N);
        }

        System.out.println("Next Generation");
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    if (grid[i][j] == 0)
                    System.out.print(".");
                    else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
