class Solution {
    public boolean isValidSudoku(char[][] board) {
        int rows = board.length;
        int cols = board[0].length;

        // Validate row
        for(int row = 0; row < rows; row++){
            Set<Character> unique = new HashSet<>();
            for(int col=0; col < cols; col++){
                char number = board[row][col];
                if(number == '.') continue;
                if(!unique.add(number)) return false;
            }
        }


        // Validate column
        for(int row = 0; row < rows; row++){
            Set<Character> unique = new HashSet<>();
            for(int col=0; col < cols; col++){
                char number = board[col][row];
                if(number == '.') continue;
                if(!unique.add(number)) return false;
            }
        }
        

        // Validate box
        for(int row = 0; row < rows; row+=3){
            for(int col=0; col < cols; col+=3){
                if(!isValidBox(board, row, col)) return false;
            }
        }

        return true;
    }

    boolean isValidBox(char[][] board, int row, int col){
        Set<Character> unique = new HashSet<>();

        for(int i=row; i < row + 3; i++){
            for(int j=col; j < col + 3; j++){
                char number = board[i][j];
                if(number == '.') continue;
                if(!unique.add(number)) return false;
            }
        }

        return true;
    }
}
