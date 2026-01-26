class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int col0=1;
        // boolean[] row = new boolean[n];
        // boolean[] col = new boolean[m];

        // // Mark rows and columns
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < m; j++) {
        //         if (matrix[i][j] == 0) {
        //             row[i] = true;
        //             col[j] = true;
        //         }
        //     }
        // }

        // // Set zeroes
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < m; j++) {
        //         if (row[i] || col[j]) {
        //             matrix[i][j] = 0;
        //         }
        //     }
        // }
        for(int i = 0; i < m; i++) {
            if(matrix[i][0] == 0) col0 = 0;
            for(int j = 1; j < n; j++) {
                if(matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for(int i = 1; i < m; i++) {
            for(int j = 1; j < n; j++) {
                if(matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            }
        }

        if(matrix[0][0] == 0) {
            for(int j = 0; j < n; j++)
                matrix[0][j] = 0;
        }

        if(col0 == 0) {
            for(int i = 0; i < m; i++)
                matrix[i][0] = 0;
        }
    }
}
