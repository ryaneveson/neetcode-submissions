class Solution {
    public boolean isValidSudoku(char[][] board) {
        //these are the sets that are going to be storing the status of the board.
        //the rows will store the validy of the rows, the cols will sotre the cols, and the box will store the box
        Map<Integer, Set<Character>> cols = new HashMap<>();
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<String, Set<Character>> squares = new HashMap<>();  

        //create a double for loop to get through the cols and the rows
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (board[r][c] == '.') continue;
                //get the box key
                // e.g. if r = 1, box = 0. if r = 4: 4/3 = box 1
                // same thing with the cols
                String squareKey = (r / 3) + "," + (c / 3);

                if (rows.computeIfAbsent(r, k -> new HashSet<>()).contains(board[r][c]) ||
                    cols.computeIfAbsent(c, k -> new HashSet<>()).contains(board[r][c]) ||
                    squares.computeIfAbsent(squareKey, k -> new HashSet<>()).contains(board[r][c])) {
                    return false;
                }
                rows.get(r).add(board[r][c]);
                cols.get(c).add(board[r][c]);
                squares.get(squareKey).add(board[r][c]);
            }
        }
        return true;
    }
}
