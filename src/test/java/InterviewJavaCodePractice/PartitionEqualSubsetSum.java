package InterviewJavaCodePractice;

public class PartitionEqualSubsetSum {

    public static boolean canPartition(int[] nums) {

        int totalSum = 0;

        // Step 1: Calculate total sum
        for (int num : nums) {
            totalSum += num;
        }

        // Step 2: If total is odd, equal partition is impossible
        if (totalSum % 2 != 0) {
            return false;
        }

        int target = totalSum / 2;

        // Step 3: dp[i] indicates whether sum i is possible
        boolean[] dp = new boolean[target + 1];

        dp[0] = true;

        // Step 4: Find whether a subset can reach target
        for (int num : nums) {
            for (int j = target; j >= num; j--) {
                dp[j] = dp[j] || dp[j - num];
            }
        }

        return dp[target];
    }

    public static void main(String[] args) {

        int[] nums = {1, 5, 11, 5};

        System.out.println(canPartition(nums));
    }
}

