package org.code.week6.binarySearchProblems.applicationSenarios;


import java.util.Arrays;

/*
There are n trees in a forest.
The heights of the trees is stored in array tree[],
where tree[i] denotes the height of the ith tree in the forest.
If the ith tree is cut at a height H, then the wood collected is tree[i] - H,
provided tree[i] > H. If the total woods that needs to be collected is exactly equal to k,
find the height H at which every tree should be cut (all trees have to be cut at the same height).
If it is not possible then return -1 else return H.

Example 1:

Input:
n = 5, k = 4
tree[] = {2, 3, 6, 2, 4}
Output: 3
Explanation: Wood collected by cutting trees
at height 3 = 0 + 0 + (6-3) + 0 + (4-3) = 4
hence 3 is to be subtracted from all numbers.
Since 2 is lesser than 3, nothing gets
subtracted from it.

Example 2:

Input:
n = 6, k = 8
tree[] = {1, 7, 6, 3, 4, 7}
Output: 4
Explanation: Wood collected by cutting trees
at height 4 = 0+(7-4)+(6-4)+0+0+(7-4) = 8

https://www.geeksforgeeks.org/problems/binary-search-in-forest--141631/1
 */
public class BinarySearchInForest{

    static int find_height(int tree[], int n, int k)
    {
        int start=0;
        int end= Arrays.stream(tree).max().orElse(0);
        long ans=0;
        while(start<=end){
            int mid=start + (end-start)/2;

            ans = getWood(tree, mid);
            if(ans==k){
                return mid;
            }else if(ans>k)
               start=mid+1;
           else
               end=mid-1;
        }
     return -1;
    }

    private static long getWood(int[] tree, int mid) {
        int ans=0;
        for (int j : tree) {
            if (j > mid) {
                ans = ans + (j - mid);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
       int[] arr={1, 7, 6, 3, 4, 7};
        System.out.println(find_height(arr,6,8));
    }
}
