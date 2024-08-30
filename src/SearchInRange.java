public class SearchInRange {
    public static void main(String[] args) {

            int[] arr = {1,2,43,55,65,23,5,1};
            int target = 2;
        System.out.println(lineearSearch(arr,target,2,3));
    }

    static int lineearSearch(int[] arr, int terget, int start, int end) {

        if (arr.length == 0) {
            return -1;
        }

        for (int i = start; i < end; i++) {

            // check for the element every index if it is == terget
            int element = arr[i];
            if (element == terget) {
                return element;
            }

        }

        return -1;

    }
}
