import java.util.*;
import java.util.stream.Collectors;

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

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
//class MergeTwoSortedList {
//    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        ListNode dummyNode = new ListNode();
//        ListNode tail = dummyNode;
//        while (list1 != null && list2 != null) {
//            if (list1.val < list2.val) {
//                tail.next = list1;
//                list1 = list1.next;
//            } else {
//                tail.next = list2;
//                list2 = list2.next;
//                tail = tail.next;
//
//            }
//            tail = tail.next;
//        }
//        tail.next = list1 != null ? list1 : list2;
//        return tail.next;
//    }
//}

// if (list1 == null) return list2;
//         if (list2 == null) return list1;
//
//         if (list1.val < list2.val) {
//        list1.next = mergeTwoLists(list1.next, list2);
//        return list1;
//        } else {
//        list2.next = mergeTwoLists(list2.next, list1);
//        return list2;
//        }
//        }


class Result {

    /*
     * Complete the 'isPangram' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING_ARRAY pangram as parameter.
     */

    public static String isPangram(List<String> pangram) {
        String alpha = "abcdefghijklmnopqrstuvqxyz";
        for (int i = 0; i < pangram.size(); i++) {
            List<String> panList = pangram.stream().map(String::toLowerCase).collect(Collectors.toList());
            String str = panList.get(i).toLowerCase();
            String newStr = str.replace(" ", "");
            if (newStr.contains(alpha)) {
                return "1";
            } else {
                return "0";
            }

        }
        return "1";
//
//        for(int i = 0; i < pangram.size(); i++){
//            String alpha = "abcdefghijklmnopqrstuvqxyz";
//            pangram.get(i);
//            if(pangram.contains(alpha)){
//                return "1";
//            }
//            else{
//                return "0";
//            }
//        }
//        return null;
    }

    public static int findMinimumDays(List<Float> durations) {
        Collections.sort( durations);
        int days = 0;
        int beginning = 0;
        int end = durations.size() - 1;
        while (beginning < end && durations.iterator().hasNext()) {
            for (int i = 0; i < durations.size(); i++) {
                if (durations.get(i) + durations.get(i + 1) <= 3.0) {
                    days++;
                }
                for (int j = i + 1; j < durations.size(); j++) {
                    if (durations.get(i) + durations.get(j + 1) <= 3.0) {
                        days++;
                    }
                }
            }
        }
        return days;
    }
}

class BinarySearch {
    public int search(int[] nums, int target) {
        int index=-1;
        int begin=0, end=nums.length-1, middle=(end+begin)/2;
        while(begin<=end){
            if (nums[middle]==target) return middle;
            if (nums[middle]>target){
                end=middle-1; middle=(end+begin)/2;
            }
            if (nums[middle]<target){
                begin=middle+1; middle=(end+begin)/2;
            }
        }
        return index;
    }
}
//Fastest Solution 0ms