/*
Q7. Sub array with given sum
Given an unsorted array A of size N that contains only non-negative integers, find a continuous sub-array which adds to a given number S.

Example 1:
Input:
N = 5, S = 12
A[] = {1,2,3,7,5}
Output: 2 4
Explanation: The sum of elements 
from 2nd position to 4th position 
is 12.

Example 2 :
Input :

N = 10, S = 15
A[] = {1,2,3,4,5,6,7,8,9,10}
Output: 1 5
Explanation: The sum of elements 
from 1st position to 5th position
is 15.
1 <= N <= 105
1 <= Ai <= 109
*/
class Test {
    public static void main(String args[])
    {
        int[] arr = {1,2,3,7,5};
        int sum = 12;
        int start = 0;
        int end = 0;
        int n = arr.length;
        int curr_sum = arr[0];
        while(end < n)
        {
            if(curr_sum == sum)
            {
                System.out.println(start+1+" "+(end+1));
                break;
            }
            else if(curr_sum > sum)
            {
                curr_sum -= arr[start];
                start++;
            }
            else
            {
                end++;
                if(end < n)
                curr_sum += arr[end];
            }
        }
    }
}