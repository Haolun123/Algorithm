public class SortAlgorithms {
 /********
  * Bubble sort is trying to find the biggest/smallest element for each single loop.
  * with each run, one element will be picked out, so next inner loop doesn't need to count the picked one.
  * That's why here we have nums.lenght-i.
  *******/
    public void bubbleSort(int[] nums){
        for(int i = 0; i < nums.length; i++){
            for(int j = 1; j < nums.length-i; j++){
                if(nums[j] < nums[j-1]){
                    nums[j] = nums[j]^nums[j-1];
                    nums[j-1] = nums[j]^nums[j-1];
                    nums[j] = nums[j]^nums[j-1];
                }
            }
        }
    }

    /*****
     * Insertion Sort is to pick a value as a key, insert it into the current sorted array.
     * while loop control the insertion, and you will see nums[j] > key in the while loop condition.
     * so once it found the correct position, it will end the while loop and assign the key to the position.
     * What while loop is trying to do is to move the elements in this array one by one.
     */

    public void insertSort(int[] nums){
        for(int i = 1; i < nums.length; i++){
            int key = nums[i];
            int j = i-1;
            while(j >= 0 && nums[j] > key){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }
    }
}
