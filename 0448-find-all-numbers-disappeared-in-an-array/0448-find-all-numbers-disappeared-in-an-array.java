

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> a = new HashSet<>();
        List<Integer> b = new LinkedList<>();

        for (int i : nums) {
            a.add(i);
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!a.contains(i)) {
                b.add(i);
            }
        }

        return b;
    }
}
