package com.ephemzy.array;

public class ArraySearching {
    public static void main(String[] args) {
        int[] nums = {3, 5, 7, 11, 13,15, 16, 18};
        int target = 11;

        int linearResult = linearSearch(nums, target);
        if (linearResult != -1)
            System.out.println("Element found at index for linear search : " + linearResult);
        else
            System.out.println("Element not found for linear search");

        int binarySearch = binarySearch(nums, target);
        if (binarySearch != -1)
            System.out.println("Element found at index for binary search : " + binarySearch);
        else
            System.out.println("Element not found for binary search: Index is :" + binarySearch );
    }

    private static int linearSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == target)
                return i;
        }
        return -1;
    }

    private static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;
        while (left <= right){
            // 3, 7, 5, 11, 9,5
            int mid = (left + right)  / 2;
            System.out.println("Left : " + left + " Middle : " + mid + " Right : " + right );
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target ) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    //Binary Search with recursion
    private static int binarySearchWithRecursion(int[] nums, int target, int left, int right) {
        if (left <= right){
            // 3, 7, 5, 11, 9, 5
            int mid = (left + right)  / 2;
            System.out.println("Left : " + left + " Middle : " + mid + " Right : " + right );
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target ) {
                return binarySearchWithRecursion(nums, target, mid + 1, right);
            } else {
                return binarySearchWithRecursion(nums, target, left, right - 1);
            }
        }
        return -1;
    }
}
