//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] nums ={12,32,43,45,676,87,53,21,34};
        int terget = 12;
        int ans = lineearSearch(nums, terget);
        System.out.println(ans);

        }

        //search in the array: return the index if item found
        // Otherwise if item not found return -1
        static int lineearSearch(int[] arr, int terget) {

            if (arr.length == 0) {
                return -1;
            }

            for (int i = 0; i < arr.length; i++) {

                // check for the element every index if it is == terget
                int element = arr[i];
                if (element == terget) {
                    return element;
                }

            }

            return -1;

        }
    }
