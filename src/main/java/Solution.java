import java.util.Arrays;
import java.util.Objects;

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
                if (nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return nums;
    }
}

class ValidPalindrome {

    /*
    * TODO Remove white space and special characters
    *      What to do:
    *       -make new string
    *       -check if its alpha numerical
    *       -include it and add it to the new string
    *       -convert it to lowercase
    *       -if equal, then true, else false
    * */
    public boolean isPalindrome(String s) {
        int i = 0; int j = s.length() - 1;
        while (i < j) {

            Character start = s.charAt(i); Character end = s.charAt(j);

            if(!Character.isLetterOrDigit(start)){
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(end)){
                j--;
                continue;
            }
            if (Character.toLowerCase(start) != Character.toLowerCase(end)){
                return false;
            }

            i++;
            j--;
        }
        return true;
    }
}