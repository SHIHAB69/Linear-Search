public class SearchIn2DArray {
        int[][] arr = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};

        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < arr[i].length; j++){
                int target = 0;
                if(arr[i][j] == target){
                    System.out.println("Element found at index: [" + i + "]" + "[" + j + "]");

                }
            }

    }
}
