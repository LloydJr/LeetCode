import java.util.Arrays;

// https://neetcode.io/practice

class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
           }
        }
        return false;
    }
}

class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        s.toLowerCase();
        t.toLowerCase();

        if(s.length() == t.length()){
            char[] charArray1 = s.toCharArray();
            char[] charArray2 = t.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            boolean result = Arrays.equals(charArray1, charArray2);

            if(result){
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }
}

class TwoSums {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){

            }
        }
        return nums;
    }
}

class ValidPalindrome {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.length() == sb.reverse().length();
    }
}