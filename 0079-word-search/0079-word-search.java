class Solution {
    public boolean dfs(char[][] board,int i, int j, int count, String word){
        if(count == word.length()) return true;
        if(i==board.length || i == -1 || j == board[0].length || j == -1 || board[i][j] != word.charAt(count))
            return false;
        
        char temp = board[i][j];
        board[i][j] = '-';
        boolean ans = dfs(board, i-1, j, count+1, word) || dfs(board, i, j+1, count+1, word) || dfs(board, i+1, j, count+1, word) ||
            dfs(board, i, j-1, count+1, word);
        board[i][j] = temp;
        
        return ans;
        
            
    }
    public boolean exist(char[][] board, String word) {
        for(int i = 0 ; i<board.length; i++)
            for(int j = 0; j<board[0].length; j++)
                if(word.charAt(0) == board[i][j] && dfs(board,i,j,0,word))
                    return true;
        return false;
    }
}