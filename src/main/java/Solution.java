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