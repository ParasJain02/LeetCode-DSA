class Solution {
    public int findKthLargest(int[] nums, int k) {
       int size=nums.length;
       int temp;
        //Heapifying the array in place
       for(int i=size/2-1;i>=0;i--){
        heap(nums,size,i);
       }
        // pop max element k times
       while(k>0){
        //swap max element at top with last element
        temp=nums[size-1];
        nums[size-1]=nums[0];
        nums[0]=temp;
        //reduce size and maintain heap property
        heap(nums,--size,0);

        k--;
       }
       return nums[size];
    }
        // heap down //max heap
    public static void heap(int[] nums,int size,int parent){
        int temp,left,right,largest;
        while(true){
            //child nodes
        left=2*parent+1;
        right=2*parent+2;
        largest=parent;
        //swap parent with greater child
        if(left<size && nums[left]>nums[parent]){
            largest=left;
        }
        if(right<size && nums[right]>nums[largest]){
            largest=right;
        }
        //break if parent is greatest
        if(largest==parent){break;}

        temp=nums[largest];
        nums[largest]=nums[parent];
        nums[parent]=temp;
        //recheck heap property for element that is pushed down from top(parent to child)
        parent=largest;
        }
    }
}