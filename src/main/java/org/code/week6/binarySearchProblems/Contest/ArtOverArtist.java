package org.code.week6.binarySearchProblems.Contest;


import java.util.Arrays;
import java.util.Scanner;

/*
Art over artist
Problem
Submissions
Leaderboard
Discussions

Maggi wants to color her garage that has n boards with different lengths.
The length of ith board is given by arr[i] where arr[] is an array of n integers.
She hired k artists for this work and each artist takes 1 unit time to paint 1 unit of the board.


Return the minimum time to get this job done if all artists start together with the constraint
that any artist will only paint continuous boards,
say boards numbered [2,3,4] or only board [1] or nothing but not boards [2,4,5].

Input Format

n = 5 arr[] = [5, 10, 30, 20, 15] k = 3

Constraints

1 ≤ arr.size() ≤ 105 1 ≤ arr[i] ≤ 105 1 ≤ k ≤ 105

Output Format

35

Sample Input 0

5
5 10 30 20 15
3
Sample Output 0

35
 */
public class ArtOverArtist {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of boards
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Read the lengths of the boards
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Read the number of artists
        int k = sc.nextInt();
        sc.close();

        // Find the result using binary search
        System.out.println(minTime(arr, n, k));
    }

    private static int minTime(int[] arr, int n, int k) {
        int low = Arrays.stream(arr).max().getAsInt();  // Maximum board length (at least one artist must paint this)
        int high = Arrays.stream(arr).sum();             // Sum of all board lengths (one artist paints everything)
        int result = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if it is possible to paint all boards in 'mid' time with 'k' artists
            if (isPossible(arr, n, k, mid)) {
                result = mid;   // Update result as we try for a smaller max time
                high = mid - 1; // Try for a smaller time
            } else {
                low = mid + 1;  // Try for a larger time
            }
        }

        return result;
    }


    private static boolean isPossible(int[] arr, int n, int k, int mid) {
        int artistCount = 1;
        int currentSum = 0;

        for (int i = 0; i < n; i++) {
            // If adding this board exceeds mid, assign it to a new artist
            if (currentSum + arr[i] > mid) {
                artistCount++;
                currentSum = arr[i];

                // If the number of artists exceeds k, return false
                if (artistCount > k) {
                    return false;
                }
            } else {
                currentSum += arr[i];
            }
        }

        return true;
    }
}
