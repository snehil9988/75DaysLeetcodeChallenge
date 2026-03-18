class Solution {
    public int smallestAbsent(int[] nums) {
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        double avg = (double) sum / nums.length;

        int candidate = (int) avg + 1;

        while (true) {
            boolean found = false;

            for (int num : nums) {
                if (num == candidate) {
                    found = true;
                    break;
                }
            }

            if (candidate > 0 && !found) {
                return candidate;
            }

            candidate++;
        }
    }
}