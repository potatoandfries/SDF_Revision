package Revision.GameOfLife.src;

import java.io.IOException;

public class GoL {

//SRP Single responsibility principle: Each class or method should have a single responsibility. 
//If a class or method is doing too many things, it might be a good idea to split it into smaller, more focused components.

    public static void main(String[] args) {
        
        //rows(M) and columns(N)
        final int M = 5;
        final int N = 5; 

        //initialize the grid
        int grid [][]= {

        {0,0,0,0,0,},
        {0,0,1,0,0,},
        {0,1,1,0,0,},
        {0,0,1,0,0,},
        {0,0,0,0,0,},

        };

        //Displaying the Grid

        System.out.println("Original Generation");
        // this is a nested loop; 
        for (int i =0; i<M ;i++)
        {
        for (int j = 0; j<N; j++)
        {// this is the inner loop
            if (grid[i][j] == 0) 
            System.out.print(".");
            else
            System.out.print("*");
                
        };
            System.out.println();      
        }
        System.out.println();
        //what u essentially did was create a whole different class just to generate the new grid and you called 
        //upon the methood of next gen.
       for (int b = 0; b < 5; b++) {
            NextGeneration.NextGen(grid, M, N);
        } 
    }
}