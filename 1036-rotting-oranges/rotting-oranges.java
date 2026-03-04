class Solution {
    public int orangesRotting(int[][] grid) {
        // start DFS from every rotten orange
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    dfs(grid, i, j, 2);
                }
            }
        }
        // check remaining fresh oranges
        int max_time = 2;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    return -1;
                }
                max_time = Math.max(max_time, grid[i][j]);
            }
        }
        return max_time - 2;
    }

    public void dfs(int[][] grid, int i, int j, int time) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length)
            return;
        if (grid[i][j] != 1 && grid[i][j] < time)
            return;

        grid[i][j] = time;

        dfs(grid, i + 1, j, time + 1);
        dfs(grid, i - 1, j, time + 1);
        dfs(grid, i, j + 1, time + 1);
        dfs(grid, i, j - 1, time + 1);
    }
}