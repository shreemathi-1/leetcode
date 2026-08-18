// Last updated: 8/18/2026, 10:48:16 PM
1class Solution {
2    // Main function to check if the word exists in the maze
3    public boolean exist(char[][] maze, String word) {
4        // Iterate through each cell in the maze
5        for (int i = 0; i < maze.length; i++) {
6            for (int j = 0; j < maze[0].length; j++) {
7                // If the current cell matches the first character of the word, start searching
8                if (maze[i][j] == word.charAt(0)) {
9                    boolean ans = search(maze, word, i, j, 0);
10                    if (ans) {
11                        return ans; // If the word is found, return true
12                    }
13                }
14            }
15        }
16        return false; // If the word is not found in the maze, return false
17    }
18    
19    // Recursive function to search for the word starting from a given position in the maze
20    public static boolean search(char[][] maze, String word, int row, int col, int idx) {
21        // Base case: If the entire word has been found, return true
22        if (idx == word.length()) {
23            return true;
24        }
25
26        // Check for out-of-bounds or mismatched characters
27        if (row < 0 || col < 0 || row >= maze.length || col >= maze[0].length || maze[row][col] != word.charAt(idx)) {
28            return false;
29        }
30
31        // Mark the current cell as visited
32        maze[row][col] = '*';
33
34        // Define the possible directions to move in the maze
35        int[] r = { -1, 1, 0, 0 };
36        int[] c = { 0, 0, -1, 1 };
37
38        // Recursively search in all four directions from the current cell
39        for (int i = 0; i < c.length; i++) {
40            boolean ans = search(maze, word, row + r[i], col + c[i], idx + 1);
41            if (ans == true) {
42                return ans; // If the word is found, return true
43            }
44        }
45
46        // Backtrack: Restore the original character in the maze
47        maze[row][col] = word.charAt(idx);
48        return false; // If the word is not found starting from the current cell, return false
49    }
50}