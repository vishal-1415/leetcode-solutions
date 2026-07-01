class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
         if(image[sr][sc] == color) return image;

         int PrevColour = image[sr][sc]; // 1 
         dfs(image, sr , sc, color, PrevColour);

    return image;
    }

    public void dfs(int[][] image, int sr, int sc, int color, int PrevColour) {
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length) {
            return;
        }
        if (image[sr][sc] != PrevColour)
            return;

        image[sr][sc] = color;

        dfs(image, sr - 1, sc, color, PrevColour);
        dfs(image, sr + 1, sc, color, PrevColour);
        dfs(image, sr, sc - 1, color, PrevColour);
        dfs(image, sr, sc + 1, color, PrevColour);

    }
}