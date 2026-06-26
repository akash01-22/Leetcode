class Solution {
    public String convertDateToBinary(String date) {
        String[] nums = date.split("-");
        return  Integer.toBinaryString(Integer.parseInt(nums[0])) + "-" +
                Integer.toBinaryString(Integer.parseInt(nums[1])) + "-" +
                Integer.toBinaryString(Integer.parseInt(nums[2]));
    }
}