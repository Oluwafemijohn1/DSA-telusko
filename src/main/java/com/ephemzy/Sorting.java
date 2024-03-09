package com.ephemzy;

public class Sorting {
    public static void main(String[] args) {
        int[] nums = {6,5,2,8,9,4};

//        bubbleSorting(nums);
//        selectionSorting(nums);
//        insertionSort(nums);
//        printQuickSort();
        printMergeSort();
    }



    /**
     * Bubble Sorting
     * */
    // The time complexity is O(n square)
    public static void bubbleSorting(int[] nums){


        int size = nums.length;
        int temp = 0;
        int swappingCount = 0;
        int iterationCount = 0;

        System.out.println("Before it is sorted");

        for (int i = 0; i < size ; i++ ){
            for (int j = 0; j < size - i - 1; j++){
                iterationCount++;
                if (nums[j] > nums[j + 1]){
                    swappingCount++;
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;

                }
            }

            System.out.println();
            for (int num: nums)
                System.out.print(num + " ");
        }

        System.out.println();
        System.out.println("After sorting");
        for (int num : nums)
            System.out.print(num + " ");

        System.out.println();
        System.out.println();
        System.out.println("Swapping Count: " + swappingCount);

        System.out.println();
        System.out.println();
        System.out.println("Iteration Count: " + iterationCount);
    }


    /**
     * Selection Sort
     * */
    // The time complexity is O(n square)
    public static void selectionSorting(int[] nums) {
        int size = nums.length;
        int temp = 0;
        int minIndex = -1;
        System.out.println("Before it is sorted");
        for (int num : nums)
            System.out.print(num + " ");
        for (int i = 0; i < size -1 ; i++ ) {
            minIndex = i;
            for (int j = i + 1; j < size ; j++) {
                if (nums[minIndex] > nums[j])
                    minIndex = j;
            }
            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
            System.out.println();
            for (int num : nums)
                System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("After sorting");
        for (int num : nums)
            System.out.print(num + " ");


    }



    /**
     * Insertion Sort
     * */
    // O ( n2)
    public static void insertionSort(int[] nums){
        int size = nums.length;
        int temp = 0;
        int minIndex = -1;
        System.out.println("Before it is sorted");
        for (int num : nums)
            System.out.print(num + " ");
        for (int i = 0; i < size; i++ ) {
            int key = nums[i];
            int j = i-1;
            while (j >=0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }

            nums[j + 1] = key;

            System.out.println();
            for (int num : nums)
                System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("After sorting");
        for (int num : nums)
            System.out.print(num + " ");

    }


    /**
     * Quick Sort
     * */
    private static void printQuickSort(){
        int[] arr = {5, 6, 2, 3, 1, 8, 4};
        quickSort(arr, 0, arr.length -1);

        for (int num : arr)
            System.out.print(num + " ");
    }

    // O(log n)
    public static void quickSort(int[] arr, int low, int high){
        if (low < high){

            int pi = partition(arr, low, high);
            System.out.println("Pi Quick: " + pi);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++){
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }


    /**
     * Merge Sort
     * */
    public static void printMergeSort(){
        int[] arr = {3, 5, 1, 4, 6, 2};

        System.out.println("Before sorting...");
        for (int num : arr)
            System.out.print(num + " ");

        System.out.println();

        mergeSort(arr, 0, arr.length-1 );

        System.out.println("After sorting...");
        for (int num : arr)
            System.out.print(num + " ");
    }

    private static void mergeSort(int[] arr, int l, int r){
        if ( l < r){
            int mid = (l + r) /2;
        System.out.println("Mid: " + mid + " l: " + l + " r: " + r);
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }
    }

    private static void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int[] lArr = new int[n1];
        int[] rArr = new int[n2];

        for (int x = 0; x < n1; x++)
            lArr[x] = arr[l + x];

        for (int x = 0; x < n2; x++)
            rArr[x] = arr[mid + 1 + x];

        int i = 0;
        int j = 0;
        int k = l;
        while (i < n1 && j < n2){
            if (lArr[i] < rArr[j]){
                arr[k] = lArr[i];
                i++;
            } else {
                arr[k] = rArr[j];
                j++;
            }
            k++;
        }

        while (i < n1){
            arr[k] = lArr[i];
            i++;
            k++;
        }

        while (j < n2){
            arr[k] = rArr[j];
            j++;
            k++;
        }
    }
}
