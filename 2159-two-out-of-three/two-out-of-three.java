class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();
        for (int num1 : nums1)
            set1.add(num1);
        for (int num2 : nums2)
            set2.add(num2);
        for (int num3 : nums3)
            set3.add(num3);
        Set<Integer> result = new HashSet<>();
        for (int num : set1) {
            if (set2.contains(num))
                result.add(num);
        }
        for (int num : set2) {
            if (set3.contains(num))
                result.add(num);
        }
        for (int num : set3) {
            if (set1.contains(num))
                result.add(num);
        }
       // ArrayList<Integer> list = new ArrayList<>(result);
        return new ArrayList<>(result);
    }
}