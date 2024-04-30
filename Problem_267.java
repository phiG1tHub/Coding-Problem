
import org.javatuples.*;
/*
This problem was asked by Oracle.

You are presented with an 8 by 8 matrix representing the positions of pieces on a chess board. The only pieces on the board are the black king and various white pieces. Given this matrix, determine whether the king is in check.

For details on how each piece moves, see here.

For example, given the following matrix:

...K....
........
.B......
......P.
.......R
..N.....
........
.....Q..

You should return True, since the bishop is attacking the king diagonally.
*/
class Problem_267{
    static class tuple{
        public int x;
        public int y;

        tuple(int a , int b){
            this.x=a;
            this.y=b;
        }

        public void print(){
            System.out.println(this.x+ " " + this.y );
        }
    }

    public static tuple find_king(char[][] board){
        
    for(int row = 0; row < 8;row++)
        for (int col = 0; col < 8;col++)
            if(board[row][col] == 'K'){
            tuple pos = new tuple(row, col);
            return pos;
            }
    return null;
    }




    
    public static void main(String[] args){
        char[][] board = {{'.','.','.','K','.','.','.','.'},
                          {'.','.','.','.','.','.','.','.'},
                          {'.','B','.','.','.','.','.','.'},
                          {'.','.','.','.','.','.','P','.'},
                          {'.','.','.','.','.','.','.','R'},
                          {'.','.','N','.','.','.','.','.'},
                          {'.','.','.','.','.','.','.','.'},
                          {'.','.','.','.','.','Q','.','.'}};

        tuple king = find_king(board);
        king.print();
    }
}