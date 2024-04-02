class Solution{
	public int[] twoSum(int[] nums, int target){
	int[] ans=new int[2];
	int n=nums.length;
	for(int i=0;i<n;i++){
		for(int j=i+1;j<n;j++){
		if(nums[i]+nums[j]==target){
			ans[0]=i;
			ans[1]=j;
		}}}
return ans;
}

}
//so basically the brute force approach is to use two loops and check for the sum of the elements of the array and if it is equal to the target then return the indices of the elements.
//Time complexity of this approach is O(n^2) and space complexity is O(1).
/*
1. **Define the Method**: We create a method named `twoSum` inside a class called `Solution`. This method takes an array of numbers (`nums`) and a target number (`target`) as inputs.

2. **Initialize Array**: We create an array named `ans` to hold the indices of the two numbers we're looking for. We set its size to 2, meaning it will hold two numbers.

3. **Find Array Length**: We find out how many numbers are in the given list (`nums`) and store that number in a variable named `n`.

4. **Loop through the Array**: We use two loops, one inside the other. The outer loop goes through each number in the list. The inner loop goes through the numbers that come after the current number we're looking at.

5. **Check Sum**: Inside the loops, we check if adding the numbers at positions `i` and `j` gives us the target number.

6. **Store Indices**: If the sum equals the target, we remember the positions of these two numbers in the `ans` array.

7. **Return Result**: After checking all possible pairs, we return the `ans` array, which holds the indices of the two numbers that add up to the target.
*/