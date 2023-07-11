// Given an array of integers and a target sum, find two numbers in the array
// that add up to the target sum.
public class arrays03
{
    public int[] twoSum(int nums[],int target)
    { 
        int[] newa=new int[2];
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length-1;j++)
            {
                int sum=nums[i]+nums[j];
                if(sum==target)
                {
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("could not find");
    }
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        arrays01 solution = new arrays01();
        int[] result = solution.twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);
    }

}

// Create a class called TwoSum.

// Define a method named twoSum that takes an array of integers (nums) and a
// target sum (target) as parameters and returns an array of two integers.
// Inside the twoSum method, initialize two nested loops. The outer loop will
// iterate from i = 0 to nums.length - 1.
// Inside the outer loop, initialize the inner loop. It will iterate from j = i
// + 1 to nums.length - 1.
// Within the inner loop, check if the sum of nums[i] and nums[j] equals the
// target sum:
// If the sum is equal to the target, return a new array with i and j as
// elements.
// If no pair is found within the loops, throw an IllegalArgumentException with
// an appropriate error message indicating that no two numbers add up to the
// target sum.
// In the main method, create an instance of the TwoSum class.
// Define an array of integers (nums) and assign values to it.
// Define a target sum (target).
// Call the twoSum method with the nums and target as arguments, and store the
// result in an array (result).
// Print the elements of the result array to display the indices of the two
// numbers that add up to the target sum.
