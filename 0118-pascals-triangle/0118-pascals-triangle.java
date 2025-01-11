class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        int n = numRows;
        int[][] tri = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i)
                    tri[i][j] = 1;
                else
                    tri[i][j] = tri[i - 1][j - 1] + tri[i - 1][j];
            }
        }
        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if (tri[i][j] != 0) {
                    row.add(tri[i][j]);
                }
            }
            list.add(row);
        }
        return list;
        
    }
}