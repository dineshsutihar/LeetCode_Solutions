class Solution {
    public int trap(int[] height) {
        int left = 0, right =(height.length -1), leftMax = 0,rightMax =0, result =0;
        
        while(left<=right){
            if(height[left]<=height[right]){
                if(leftMax<height[left]){
                    leftMax = height[left];
                }else{
                    result += leftMax - height[left];
                    left++;
                }
            }else {
                if(height[right]>rightMax){
                    rightMax = height[right];
                }else{
                    result += rightMax-height[right];
                    right--;
                }
            }
        }
        
        return result;
        
    }
}

//Approach: Take 2 pointers l(left pointer) and r(right pointer) pointing to 0th and (n-1)th index respectively. Take two variables leftMax and rightMax and initialize them to 0. If height[l] is less than or equal to height[r] then if leftMax is less than height[l] update leftMax to height[l] else add leftMax-height[l] to your final answer and move the l pointer to the right i.e l++. If height[r] is less than height[l], then now we are dealing with the right block. If height[r] is greater than rightMax, then update rightMax to height[r] else add rightMax-height[r] to the final answer. Now move r to the left. Repeat these steps till l and r crosses each other.