public class CheckForSortedArray {

    public static boolean inOrder(int[] nums) {
        /* Type your code here. */
    }

    public static void main(String[] args) {

        // Test out-of-order example.
        int[] nums1 = {5, 6, 7, 8, 3};

        if (inOrder(nums1)) {
            System.out.println("In order");
        } else {
            System.out.println("Not in order");
        }

        // Test in-order example.
        int[] nums2 = {5, 6, 7, 8, 10};

        if (inOrder(nums2)) {
            System.out.println("In order");
        } else {
            System.out.println("Not in order");
        }
    }
}
