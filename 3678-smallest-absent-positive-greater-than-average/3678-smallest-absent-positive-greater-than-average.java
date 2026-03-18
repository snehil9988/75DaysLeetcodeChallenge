class Solution {
    public int smallestAbsent(int[] nums) {
         int sum = 0;
        int n = nums.length;
        for (int num : nums) {
            sum += num;
        }
        double avg = (double) sum / n;
        java.util.HashSet<Integer> set = new java.util.HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int candidate = (int) Math.floor(avg) + 1;

        while (true) {
            if (candidate > 0 && !set.contains(candidate)) {
                return candidate;
            }
            candidate++;
        }
        
    }
}