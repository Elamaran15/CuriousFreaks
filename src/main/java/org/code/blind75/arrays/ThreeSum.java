package org.code.blind75.arrays;

//https://leetcode.com/problems/3sum/description/

import java.util.*;

/*
15. 3Sum
Medium
Topics
premium lock icon
Companies
Hint
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.



Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation:
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
Example 2:

Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.
Example 3:

Input: nums = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.


Constraints:

3 <= nums.length <= 3000
-105 <= nums[i] <= 105

 */
public class ThreeSum {



    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> listAns=new ArrayList<>();
        Set<Integer> ans=new TreeSet<>();

        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]+nums[j]+nums[k]==0) {
                        ans.add(nums[i]);
                        ans.add(nums[j]);
                        ans.add(nums[k]);
                        listAns.add(ans.stream().toList());
                    }
                }
            }
        }

        return listAns;

    }



    static List<List<Integer>> threeSumBetterApproach(int[] nums){
        List<List<Integer>> ans=new ArrayList<>();
        Set<Integer> internalSet=new HashSet<>();
        int n= nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int third = - (nums[i]+nums[j]);
                if(internalSet.contains(third)){
                   List<Integer> triplets= new ArrayList<>(List.of(nums[i], nums[j], third));
                   triplets.sort(Integer::compareTo);
                   if(!ans.contains(triplets)){
                       ans.add(triplets);
                   }
                }else{
                    internalSet.add(nums[j]);
                }
            }
            internalSet.clear();
        }

        return ans;
    }


    static List<List<Integer>> optimisedApproach(int[] nums){
        // Final answer list that will store all unique triplets
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;

        // Step 1: Sort the array (important for two-pointer technique and avoiding duplicates)
        Arrays.sort(nums);

        // Step 2: Fix one number at a time (nums[i]) and use two pointers to find the other two
        for (int i = 0; i < n; i++) {

            // Skip duplicates for the fixed number nums[i] (avoid repeated triplets)
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            // Left and right pointers
            int j = i + 1, k = n - 1;

            // Step 3: Two-pointer search between nums[j] and nums[k]
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                // Case 1: Found a triplet
                if (sum == 0) {
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k])); // Store triplet
                    j++;
                    k--;

                    // Skip duplicate values for nums[j]
                    while (j < k && nums[j] == nums[j - 1]) j++;

                    // Skip duplicate values for nums[k]
                    while (j < k && nums[k] == nums[k + 1]) k--;

                    // Case 2: If sum is too small, move left pointer forward to increase sum
                } else if (sum < 0) {
                    j++;

                    // Case 3: If sum is too large, move right pointer backward to decrease sum
                } else {
                    k--;
                }
            }
        }

        // Step 4: Return the list of all unique triplets
        return ans;
    }


    public static void main(String[] args) {
        int[] arr={-2,-2,-2,-1,-1,-1,0,0,0,2,2,2,2};

        optimisedApproach(arr).forEach(System.out::println);
    }

}
